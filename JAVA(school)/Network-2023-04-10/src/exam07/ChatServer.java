package exam07;

import org.json.JSONObject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
    ServerSocket serverSocket;
    ExecutorService threadPool = Executors.newFixedThreadPool(100);
    Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

    public void start() throws IOException{
        serverSocket = new ServerSocket(50001);
        System.out.println("[서버] 시작 됨");

        Thread thread = new Thread(() -> {
            try {
                while(true){
                    Socket socket = serverSocket.accept();
                    SocketClient sc = new SocketClient(ChatServer.this, socket);
                }
            }catch (Exception e){
            }
        });
        thread.start();
    }
    public void addSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName+"@"+socketClient.clientlp;
        chatRoom.put(key,socketClient);
        System.out.println("입장: "+key);
        System.out.println("현재 채팅자 수: "+chatRoom.size()+"\n");
    }

    public void removeSocketClient(SocketClient socketClient){
        String key = socketClient.chatName+"@"+socketClient.clientlp;
        chatRoom.remove(key);
        System.out.println("나감: "+key);
        System.out.println("현재 채팅자 수: "+chatRoom.size()+"\n");
    }

    public void sendToAll(SocketClient sender, String message){
        JSONObject root = new JSONObject();
        root.put("clientlp", sender.clientlp);
        root.put("chatName", sender.chatName);
        root.put("message", message);
        String json = root.toString();

        Collection<SocketClient> socketClients = chatRoom.values();
        for (SocketClient sc:socketClients){
            if(sc == sender) continue;
            sc.send(json);
        }
    }
    public void stop() {
        try {
            serverSocket.close();
            threadPool.shutdownNow();
            chatRoom.values().stream().forEach(sc -> sc.close());
        } catch (Exception e) {}
    }

    public static void main(String[] args){
        try{
            ChatServer chatServer = new ChatServer();
            chatServer.start();

            System.out.println("----------------------------");
            System.out.println("서버를 종료하려면 q를 입력하고 Enter");
            System.out.println("----------------------------");

            Scanner scanner = new Scanner(System.in);

            while(true){
                String key = scanner.nextLine();
                if(key.equals("q")) break;
            }
            scanner.close();
        }catch (IOException e){
            System.out.println("[서버]"+e.getMessage());
        }
    }
}

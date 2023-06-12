package exam07;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class SocketClient {
    //필드
    ChatServer chatServer;
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String clientIp;
    String chatName;

    //생성자
    public SocketClient(ChatServer chatServer , Socket socket) {

        try{
            this.chatServer = chatServer;
            this.socket = socket;
            this.dis = new DataInputStream(socket.getInputStream()); //**출제예정**
            this.dos = new DataOutputStream(socket.getOutputStream()); //**출제예정**

            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            this.clientIp = isa.getHostName();
            receive(); //**출제예정**

        }catch(IOException e){

        }
    }

    //메소드: JSON 받기
    public void receive() {
        chatServer.threadPool.execute(() -> { //**출제예정**
            try {
                while (true)  {

                    //{"command":"incoming","data":"chatName"}
                    //{"command":"message","data":"xxxx"}
                    String receiveJson = dis.readUTF();

                    JSONObject jsonObject = new JSONObject(receiveJson);
                    String command = jsonObject.getString("command");

                    switch (command) {
                        case "incoming":
                            this.chatName = jsonObject.getString("data");
                            chatServer.sendToAll(this,"들어오셨습니다");
                            chatServer.addSocketClient(this); //**출제예정**
                            break;
                        case "message":
                            String message = jsonObject.getString("data");
                            chatServer.sendToAll(this,message); //**출제예정**
                            break;
                    }

                }

            }catch (IOException e) {
                chatServer.sendToAll(this,"나가셨습니다.");
                chatServer.removeSocketClient(this); //**출제예정**

            }
        });
    }

    //메소드: JSON 보내기
    public void send(String json) {

        try{
            dos.writeUTF(json); //**출제예정**
            dos.flush(); //**출제예정**
        }catch (IOException e) {
        }
    }

    public void close() {
        try{
            socket.close(); 

        }catch (IOException e){
        }
    }
}
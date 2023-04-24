import java.net.*;
import java.util.Scanner;

public class NewsServer {
    private static  DatagramSocket datagramSocket;

    public static void main(String[] args){
        System.out.println("---------------------------------------------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 입력하세요.");
        System.out.println("---------------------------------------------");

        startServer();

        Scanner scanner = new Scanner(System.in);

        while(true){
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();
        stopServer();
    }

    private static void startServer(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    datagramSocket = new DatagramSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while(true){
                        DatagramPacket receivepacket = new DatagramPacket(new byte[1024], 1024);
                        System.out.println("클라이언트의 희망 뉴스 종류를 얻기 위해 대기중");
                        datagramSocket.receive(receivepacket);
                        String newsKind = new String(receivepacket.getData(), 0, receivepacket.getLength(), "UTF-8");
                        SocketAddress socketAddress = receivepacket.getSocketAddress();
                        for(int i = 0; i <= 10; i++){
                            String data = newsKind+": 뉴스"+i;
                            byte[] bytes = data.getBytes("UTF-8");
                            DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
                            datagramSocket.send(sendPacket);

                            Thread.sleep(1000);
                        }
                    }
                } catch (Exception e){
                    System.out.println("[서버]: "+e.getMessage());
                }
            }
        };
        thread.start();
    }
    private static void stopServer(){
        datagramSocket.close();
        System.out.println("[서버] 종료됨");
    }
}

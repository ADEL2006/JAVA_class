import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            File file01 = new File("aaa.txt");
            file01.createNewFile();
            FileInputStream _fis = new FileInputStream(file01);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(_fis));

//            String _str01 = "";
//            while ((_str01 = in.readLine()) != null) {
//                System.out.println(_str01);
//            }

            File file02 = new File("bbb.txt");
            FileOutputStream _fos = new
                    FileOutputStream(file02, true);
            if(file02.exists() == false){
                file02.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file02);
            pw.println("12345");
            pw.flush();

//            file02.mkdir();
//            file02.mkdir();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
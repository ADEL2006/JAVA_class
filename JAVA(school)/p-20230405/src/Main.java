import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        for (int i = 2;; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i+"x"+j+"="+(i*j)+"   ");
                i++;
                if(i > a) {break;}
                System.out.print(i+"x"+j+"="+(i*j)+"   ");
                i++;
                if(i > a) {break;}
                System.out.print(i+"x"+j+"="+(i*j)+"   ");
                System.out.println();
            }
            System.out.println();
            if(i > a) {break;}
        }

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        System.out.print("입력: ");
        String n = sc.nextLine();
        int size = n.length();
        int pos = 0;
        int char_num = 0;
        int int_num = 0;
        while (true) {
            char c = n.charAt(pos);
            if ('a' < c && c < 'z') {
                char_num++;
            } else if ('0' < c && c <= '9') {
                int_num++;
            }
            if(pos == size-1) {
                break;
            }
            pos++;
        }
        System.out.println("문자열: "+char_num);
        System.out.print("숫자: "+int_num);
    }
}

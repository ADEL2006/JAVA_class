import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int[] num = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

        while(true) {
            System.out.print((i+1)+"번째 숫자 입력: ");
            num[i] = Integer.parseInt(bf.readLine());

            if (colNum(num[i]) && notSameNum(num[i])) {
                System.out.println(num[i]);
                i++;
            }else {System.out.println("다시하셈 ㅋㅋㄹㅃㅃ");}

            if (i == 3) {break;}
        }
    }
    static boolean colNum(int cn) {
        if (0 < cn && cn < 1000) {
            return true;
        }else {
            return false;
        }
    }

    static boolean notSameNum(int cn) {
        int cnt = 0;
        for (int i = 0; i < num.length; i++) {
            if (cn == num[i]) {
                cnt++;
            }
        }
        return cnt < 2 ? true : false;
    }
}
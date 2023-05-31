import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(bf.readLine());
            System.out.println(num[i] > 1000 || num[i] < 1 ? num[i] : "다시하셈 ㅋㅋㄹㅃㅃ");
        }
    }
}
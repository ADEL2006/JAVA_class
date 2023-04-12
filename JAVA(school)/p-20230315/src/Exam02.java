import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02 {
    void processMethod() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("크기입력: ");
        int n = Integer.parseInt(in.readLine());
        int[][] arr = new int[n][n];

        int x = 0, y = 0; // 실수로 x, y 반대로 적음 거의 뭐 바오밥 나무ㅋㅋㅋ
        int num = 1;

        while (num <= n * n) {

            while (y < n && arr[x][y] == 0) {
                arr[x][y++] = num++;
            }
            y--; x++;

            while (x < n && arr[x][y] == 0) {
                arr[x++][y] = num++;
            }
            x--; y--;

            while (y >= 0 && arr[x][y] == 0) {
                arr[x][y--] = num++;
            }
            y++; x--;

            while (x >= 0 && arr[x][y] == 0) {
                arr[x--][y] = num++;
            }
            x++; y++;

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

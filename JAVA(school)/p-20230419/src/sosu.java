import java.util.ArrayList;
import java.util.Scanner;

public class sosu {
    public static void sosu(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 : ");
        int start = sc.nextInt();
        System.out.print("두번째 숫자 : ");
        int end = sc.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        System.out.println("입력된 숫자 [" + start + ", " + end + "] 사이의 소수는 " + primes.toString() + " 총 [" + primes.size() + "개] 입니다.");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

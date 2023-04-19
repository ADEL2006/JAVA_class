import java.util.Scanner;

public class sosujum {
    public static void sosujum(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("분자 입력 : ");
        int numerator = sc.nextInt();

        System.out.print("분모 입력 : ");
        int denominator = sc.nextInt();

        double result = (double) numerator / denominator;

        System.out.println("입력된 분수 [ " + numerator + "/" + denominator + " ]의 값은 [ " + result + " ] 입니다.");

        int sum = 0;
        String decimalPart = String.valueOf(result).split("\\.")[1];

        for (int i = 0; i < 6; i++) {
            sum += Character.getNumericValue(decimalPart.charAt(i));
        }

        System.out.println("소수점이하 첫번째에서 6번째까지의 합은 [ " + sum + " ] 입니다.");

        sc.close();
    }
}

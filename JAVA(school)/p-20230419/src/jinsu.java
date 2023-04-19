import java.util.Scanner;

public class jinsu {
    public static void jinsu(String args[]){

        Scanner scanner = new Scanner(System.in);
        String binary;
        int decimal;

        while (true) {
            System.out.print("2진수 입력 : ");
            binary = scanner.nextLine();

            if (binary.length() > 10) {
                System.out.println("2진수는 최대 10자리까지 입력가능합니다.");
                continue;
            }

            boolean isBinary = true;
            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) != '0' && binary.charAt(i) != '1') {
                    isBinary = false;
                    break;
                }
            }

            if (!isBinary) {
                System.out.println("올바른 2진수 값을 입력하세요.");
                continue;
            }

            decimal = Integer.parseInt(binary, 2);
            System.out.printf("입력한 2진수 [ %s ] %n", binary);
            System.out.printf("변경한 10진수 [ %d ] %n", decimal);

            System.out.print("계속하시겠습니까( Y, N ) : ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("Y")) {
                break;
            }
        }
        scanner.close();
    }
}

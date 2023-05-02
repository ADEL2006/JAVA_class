import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2;
        int y1, y2;
        double result;

        System.out.print("첫번쩨 X좌표: ");
        x1 = sc.nextInt();
        System.out.print("첫번쩨 Y좌표: ");
        y1 = sc.nextInt();
        System.out.print("두번쩨 X좌표: ");
        x2 = sc.nextInt();
        System.out.print("두번쩨 Y좌표: ");
        y2 = sc.nextInt();
        result = (Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)));
        result = (Math.round(result*100)/100.0);

        System.out.println("두점 사이의 길이는 "+result+"입니다.");
    }
}
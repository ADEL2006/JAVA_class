import java.util.Scanner;

public class Main {
    /**public static void main(String[] args) {
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
    }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1, x2, x3;
        int y1, y2, y3;
        double result;
        System.out.print("첫번쩨 X좌표: ");
        x1 = sc.nextInt();
        System.out.print("첫번쩨 Y좌표: ");
        y1 = sc.nextInt();
        System.out.print("두번쩨 X좌표: ");
        x2 = sc.nextInt();
        System.out.print("두번쩨 Y좌표: ");
        y2 = sc.nextInt();
        System.out.print("세번쩨 X좌표: ");
        x3 = sc.nextInt();
        System.out.print("세번쩨 Y좌표: ");
        y3 = sc.nextInt();
        result = (x2 - x3) * (y1 - y2) / 2;
        if (result < 0){
            result *= -1;
        }
        result = (Math.round(result*100)/100.0);
        System.out.println("삼각형의 넓이는: "+result);
    }
}
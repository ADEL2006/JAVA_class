import java.lang.*;

public class Example {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        boolean isEqual = obj1.equals(obj2);
        System.out.println(isEqual);

        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;
        System.out.println(result);

        int x = 5;
        int y = 10;
        int max = Math.max(x, y);
        System.out.println("최대값: " + max);

        System.out.println("output 출력");
        System.err.println("error 출력");

        try {
            int num = Integer.parseInt("abc");
            System.out.println("피싱된 수: " + num);
        } catch (NumberFormatException e) {
            System.out.println("유효하지 않는 숫자 초기화");
        }
    }
}

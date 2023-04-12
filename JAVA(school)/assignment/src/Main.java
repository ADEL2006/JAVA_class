import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand_num = 0;
        int in_num;
        int cnt = 0;
        rand_num = (int)(Math.random()*99)+1;
        in_num = (int)(Math.random()*99)+1;
        while(true){
            in_num = (int)(Math.random()*99)+1;
            System.out.println("입력숫자: "+in_num);
            System.out.println("랜덤숫자: "+rand_num);
            if (in_num > rand_num){
                System.out.println("UP");
            }
            else if (in_num == rand_num){
                System.out.println("SAME");
                break;
            }
            else{
                System.out.println("DOWN");
            }
            System.out.println();
            cnt++;
        }
        System.out.println("횟수: "+cnt);
    }
}


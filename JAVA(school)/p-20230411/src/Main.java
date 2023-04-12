import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        int number = 0;
        int de = 0;
        int so = 0;
        String[] num_arr = new String[100];
        int num_cnt = 0;
        String[] de_arr = new String[100];
        int de_cnt = 0;
        String[] so_arr = new String[100];
        int so_cnt = 0;
        for (int i = 0; i < value.length(); i++) {
            if(47 < value.charAt(i) && value.charAt(i) < 58){
                number++;
                num_arr[num_cnt++] = value.charAt(i);
            }else if(64 < value.charAt(i) && value.charAt(i) < 91){
                de++;
                de_arr[de_cnt++] = value.charAt(i);
            }else{
                so++;
                de_arr[de_cnt++] = value.charAt(i);
            }
        }
        System.out.println("숫자: "+number+'개'+" / "+num_arr);
        System.out.println("대문자: "+de+'개'+" / "+de_arr);
        System.out.println("소문자: "+so+'개'+" / "+so_arr);
    }
}


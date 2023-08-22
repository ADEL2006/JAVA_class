import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
    public static void main(String args[]) {
        processMethod();
    }

    static void processMethod() {
        try{
            BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
            while(true) {
                System.out.println("1. 입력");
                System.out.println("2. 출력");
                System.out.println("3. 종료");
                System.out.println("메뉴선택: ");
                String _mennu01 = in.readLine();

                switch(_mennu01) {
                    case "1":
                        inputFile_Text();
                        break;
                    case "2":
                        printFile_Text();
                        break;
                    case "3" :
                        return;
                    default:
                        System.out.println("잘못된 입력입니다.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void inputFile_Text() {

    }

    static void printFile_Text() {

    }
}

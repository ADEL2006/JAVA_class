package Exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Main _main;
    BufferedReader in;
    PhoneNumber_Class[] mArray = new PhoneNumber_Class[100];

    public static void main(String[] args) throws IOException {
        _main = new Main();
        _main.processMethod();
    }

    private void processMethod() throws IOException {
        init_Value();
        boolean isFinish = false;
        while(isFinish == false) {
            isFinish = printMessage();

        }
    }
    private void init_Value() {
        in = new BufferedReader(new InputStreamReader(System.in));
    }
    private boolean printMessage() throws IOException {
        System.out.println("1. 입력");
        System.out.println("2. 출력");
        System.out.println("3. 검색");
        System.out.println("9. 종료");
        System.out.print("메뉴를 선택하세요: ");
        String _menu = in.readLine();


        if(_menu.equals("1")){
            insertMethod();
            return false;
        }
        else if(_menu.equals("2")){
            printInfo();
            return false;
        }
        else if(_menu.equals("3")){
            searchName();
            return false;
        }
        else if(_menu.equals("9")){
            return true;
        }
        return false;
    }
    private void insertMethod() throws IOException {
        PhoneNumber_Class _temp = new PhoneNumber_Class();
        System.out.println("이름 입력: ");
        _temp.name = in.readLine();
        System.out.println("전화번호 입력: ");
        _temp.phonenumber = Integer.parseInt(in.readLine());

        for (int _pos = 0; _pos < mArray.length; _pos++) {
            if(mArray[_pos] == null) {
                mArray[_pos] = _temp;
                break;
            }
        }
    }

    private void printInfo() {
        System.out.println("저장된 정보 출력");
        int cnt = 0;

        for (int _pos = 0; _pos < mArray.length; _pos++) {
            if(mArray[_pos] != null) {
                System.out.println("이름: " + mArray[_pos].name + " / 전화 번호: " + mArray[_pos].phonenumber);
                cnt++;
            }
        }

        System.out.println("총 "+cnt+"개");
    }

    private void searchName() throws IOException{
        System.out.println("검색할 이름 입력: ");
        String _name = in.readLine();

        boolean isSearch = false;

        for (int _pos = 0; _pos < mArray.length; _pos++) {
            if(mArray[_pos] != null) {
                if(mArray[_pos].name.contains(_name)) {
                    System.out.println("이름: " + mArray[_pos].name + " / 전화 번호: " + mArray[_pos].phonenumber);
                    isSearch = true;
                }
            }
        }
        if(isSearch == false) {
            System.out.println("입력한 이름이 없습니다.");
        }
    }
}

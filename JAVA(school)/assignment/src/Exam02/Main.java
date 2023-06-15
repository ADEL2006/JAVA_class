package Exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    static Main _main;
    BufferedReader in;
    HashSet<PhoneNumber_Class> mArray = new HashSet<>();

    public static void main(String[] args) throws IOException {
        _main = new Main();
        _main.processMethod();
    }

    private void processMethod() throws IOException {
        init_Value();
        boolean isFinish = false;
        while (isFinish == false) {
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
        System.out.println("메뉴를 선택하세요: ");
        String _menu = in.readLine();

        if (_menu.equals("1")) {
            insertMethod();
            return false;
        } else if (_menu.equals("2")) {
            printInfo();
            return false;
        } else if (_menu.equals("3")) {
            searchName();
            return false;
        } else if (_menu.equals("9")) {
            return true;
        }
        return false;
    }

    private void insertMethod() throws IOException {
        PhoneNumber_Class _temp = new PhoneNumber_Class();
        System.out.println("이름 입력: ");
        _temp.name = in.readLine();
        System.out.println("전화번호 입력: ");
        _temp.phonenumber = in.readLine();

        mArray.add(_temp);
    }

    private void printInfo() {
        System.out.println("저장된 정보 출력");

        Iterator _it = mArray.iterator();
        while (_it.hasNext()) {
            PhoneNumber_Class _temp = (PhoneNumber_Class) _it.next();
            System.out.println("이름: " + _temp.name + " / 전화번호: " + _temp.phonenumber);
        }

    }

    private void searchName() throws IOException {
        System.out.println("검색할 이름 입력: ");
        String _name = in.readLine();

        boolean isSearch = false;

        Iterator _it = mArray.iterator();
        while (_it.hasNext()) {
            PhoneNumber_Class _temp = (PhoneNumber_Class) _it.next();
            if (_temp.name.contains(_name)) {
                System.out.println("이름: " + _temp.name + " / 전화번호: " + _temp.phonenumber);
                isSearch = true;
            }
        }

        if (isSearch == false) {
            System.out.println("입력한 이름이 없습니다.");
        }
    }
}

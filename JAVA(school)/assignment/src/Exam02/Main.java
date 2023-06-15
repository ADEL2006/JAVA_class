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
    public int cnt = 0;

    public static void main(String[] args) throws IOException {
        _main = new Main();
        _main.processMethod();
    }

    private void processMethod() throws IOException {
        init_Value();
        boolean isFinish = false;
        while (!isFinish) {
            isFinish = printMessage();
        }
    }

    private void init_Value() {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    private boolean printMessage() throws IOException {
        System.out.println("\n1. 입력");
        System.out.println("2. 출력");
        System.out.println("3. 검색");
        System.out.println("4. 삭제");
        System.out.println("9. 종료");
        System.out.print("메뉴를 선택하세요: ");
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
        } else if (_menu.equals("4")) {
            deleteName();
            return false;
        } else if (_menu.equals("9")) {
            return true;
        }
        return false;
    }

    private void insertMethod() throws IOException {
        PhoneNumber_Class _temp = new PhoneNumber_Class();
        System.out.print("이름 입력: ");
        _temp.name = in.readLine();
        System.out.print("전화번호 입력: ");
        _temp.phonenumber = in.readLine();

        mArray.add(_temp);

        cnt++;
    }

    private void printInfo() {
        System.out.println("\n저장된 정보 출력\n");

        Iterator<PhoneNumber_Class> _it = mArray.iterator();
        System.out.println("총 " + cnt + "개");
        while (_it.hasNext()) {
            PhoneNumber_Class _temp = _it.next();
            System.out.println("이름: " + _temp.name + " / 전화번호: " + _temp.phonenumber);
        }

    }

    private void searchName() throws IOException {
        System.out.print("검색할 이름 입력: ");
        String _name = in.readLine();
        System.out.println();

        boolean isSearch = false;

        Iterator<PhoneNumber_Class> _it = mArray.iterator();
        while (_it.hasNext()) {
            PhoneNumber_Class _temp = _it.next();
            if (_temp.name.contains(_name)) {
                System.out.println("이름: " + _temp.name + " / 전화번호: " + _temp.phonenumber);
                isSearch = true;
            }
        }

        if (!isSearch) {
            System.out.println("입력한 이름이 없습니다.");
        }
    }

    private void deleteName() throws IOException {
        System.out.print("삭제할 이름 입력: ");
        String _name = in.readLine();
        System.out.println();

        boolean isSearch = false;
        int count = 0;

        Iterator<PhoneNumber_Class> _it = mArray.iterator();
        while (_it.hasNext()) {
            PhoneNumber_Class _temp = _it.next();
            if (_temp.name.contains(_name)) {
                isSearch = true;
                count++;
            }
        }

        if (!isSearch) {
            System.out.println("입력한 이름이 없습니다.");
        } else {
            if (count == 1) {
                _it = mArray.iterator();
                while (_it.hasNext()) {
                    PhoneNumber_Class _temp = _it.next();
                    if (_temp.name.contains(_name)) {
                        _it.remove();
                        System.out.println("(이름: " + _temp.name + " / 전화번호: " + _temp.phonenumber + ") 가 삭제되었습니다.");
                        cnt--;
                        break;
                    }
                }
            } else {
                _it = mArray.iterator();
                int select = 1;
                System.out.println("입력하신 이름이 2개 이상 존재합니다.\n");
                while (_it.hasNext()) {
                    PhoneNumber_Class _temp = _it.next();
                    if (_temp.name.contains(_name)) {
                        System.out.print(select++ + "번: ");
                        System.out.println("이름: " + _temp.name + " / 전화번호: " + _temp.phonenumber);
                    }
                }

                System.out.print("\n삭제하실 번호를 선택하세요: ");
                int choose = Integer.parseInt(in.readLine());

                _it = mArray.iterator();
                select = 1;
                while (_it.hasNext()) {
                    PhoneNumber_Class _temp = _it.next();
                    if (_temp.name.contains(_name)) {
                        if (select == choose) {
                            _it.remove();
                            System.out.println("(이름: " + _temp.name + " / 전화번호: " + _temp.phonenumber + ") 가 삭제되었습니다.");
                            cnt--;
                            break;
                        }
                        select++;
                    }
                }
            }
        }
    }

}
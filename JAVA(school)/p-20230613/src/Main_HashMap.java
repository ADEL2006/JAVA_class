import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_HashMap {
    static Main_HashMap _main;
    BufferedReader in;
    HashMap<String, PhotoCard_Class> mMap_Values = new HashMap<>();

    public static void main(String[] args) throws IOException {
        _main = new Main_HashMap();
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
        System.out.println("1. 입력");
        System.out.println("2. 출력");
        System.out.println("3. 검색");
        System.out.println("4. 삭제");
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
        } else if (_menu.equals("4")) {
            deleteName();
            return false;
        } else if (_menu.equals("9")) {
            return true;
        }
        return false;
    }

    private void insertMethod() throws IOException {
        PhotoCard_Class _temp = new PhotoCard_Class();
        System.out.println("이름 입력: ");
        _temp.name = in.readLine();
        System.out.println("가격 입력: ");
        _temp.price = Integer.parseInt(in.readLine());

        mMap_Values.put(_temp.name, _temp);
    }

    private void printInfo() {
        System.out.println("저장된 정보 출력");

        for (PhotoCard_Class card : mMap_Values.values()) {
            System.out.println("이름: " + card.name + " / 가격: " + card.price);
        }
    }

    private void searchName() throws IOException {
        System.out.println("검색할 이름 입력: ");
        String _name = in.readLine();

        if (mMap_Values.containsKey(_name)) {
            PhotoCard_Class card = mMap_Values.get(_name);
            System.out.println("이름: " + card.name + " / 가격: " + card.price);
        } else {
            System.out.println("입력한 이름이 없습니다.");
        }
    }

    private void deleteName() throws IOException {
        System.out.println("삭제할 이름 입력: ");
        String _name = in.readLine();

        if (mMap_Values.containsKey(_name)) {
            mMap_Values.remove(_name);
            System.out.println("이름 " + _name + "이/가 삭제되었습니다.");
        } else {
            System.out.println("입력한 이름이 없습니다.");
        }
    }
}


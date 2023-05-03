public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class students{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    public int getTotal(int kor, int eng, int math){
        return kor+eng+math;
    }
    public float getAverage(int kor, int eng, int math){
        return (kor+eng+math)/2;
    }
}
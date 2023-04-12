public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //System.out.println(args[10]);
        B b1 = null;
        b1.a = 20;
        System.out.println("b1.a = " + b1.a);
        int a = 10/0;
    }
}

class B{
    int a = 10;
}
public class Main {
    public static void main(String[] args) {
        int A = 63;
        int B = 7;

        Operator.plus(A, B);
        Operator.minus(A, B);
        Operator.multiple(A, B);
        Operator.divide(A, B);
    }


}
class Operator{
    double add(double a, double b){
        double sum = a + b;
        System.out.print(sum);
        return sum;
    }

    static void plus (int a, int b){

        System.out.print(a+b+", ");
    }
    static void minus (int a, int b){
        System.out.print(a-b+", ");
    }
    static void multiple (int a, int b){
        System.out.print(a*b+", ");
    }
    static void divide (int a, int b){
        System.out.print(a/b);
    }
}
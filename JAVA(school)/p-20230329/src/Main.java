public class Main {
    public static void main(String[] args) {
        //int apple = 123;
        //int bucket_size = 10;
        //int bucket = (apple + (bucket_size - (apple % bucket_size))) / bucket_size;
        //System.out.println(bucket);

        //int num = 10;
        //System.out.println(num>0 ? "양수" : num < 0 ? "음수" : "0");

        //int num = 456;
        //System.out.println(num-(num%100));

        //int num = 333;
        //System.out.println(num-(num%10)+1);

        //int num = 24;
        //System.out.println(10-(num%10));

        float FA = 100;
        float CE = ((FA-32) * 5 / 9f * 100 - ((((FA-32) * 5 / 9f * 1000) % 10) < 5 ? ((FA-32) * 5 / 9f * 100 % 1) : (((FA-32) * 5 / 9f * 100 % 1) - 1))) / 100f;
        System.out.println("Fahrenheit: "+FA);
        System.out.println("Celcius: "+CE);
    }
}
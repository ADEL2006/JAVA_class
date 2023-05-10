public class Main {
    public static void main(String[] args) {
    }
}


class Exam01{
    public static void main(String[] args){
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
    static int[] shuffle(int[] arr){
        if (arr == null || arr.length == 0){
            return arr;
        }
        for (int x = 0; x < arr.length*2; x++){

        }
        return arr;
    }
}
import java.util.Arrays;
import java.util.Random;

public class SortingExecutor {
    private static final int DATA_SIZE = 10000;

    private final SelectionSort selectionSort;

    private int[] sampleData;

    public SortingExecutor() {
        this.selectionSort = new SelectionSort();
    }

    public void makeSampleData() {
        this.sampleData = new int[DATA_SIZE];
        Random random = new Random();

        for (int i = 0 ; i < this.sampleData.length ; i++) {
            this.sampleData[i] = random.nextInt(10000);
        }
    }

    public int[] doSorting() {
        int[] sorted = selectionSort.sort(this.sampleData);
        return sorted;
    }

    public static void main(String[] args) {
        SortingExecutor executor = new SortingExecutor();
        executor.makeSampleData();
        System.out.println("정렬전 : " + Arrays.toString( executor.sampleData ));
        int[] sorted = executor.doSorting();
        System.out.println("정렬후 : " + Arrays.toString(sorted));
    }
}













/*
public class SelectionSort {
    public int[] sort(int[] unsorted) {
        return this.doSelectionSorting(unsorted);
    }

    public void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int[] doSelectionSorting(int[] unsorted_arr) {
        int n = unsorted_arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (unsorted_arr[j] < unsorted_arr[minIndex]) {
                    minIndex = j;
                }
            }
            swapArr(unsorted_arr, minIndex, i);
        }
        return unsorted_arr;
    }
}
*/
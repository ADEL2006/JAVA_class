import java.util.Arrays;
import java.util.Random;

public class SortingExecutor {
    private static final int SAMPLE_DATA_SIZE = 10000;

    private final SelectionSort selectionSort;

    private int[] sampleData;

    public SortingExecutor() {
        this.selectionSort = new SelectionSort();
    }

    public void makeSampleData() {
        this.sampleData = new int[SAMPLE_DATA_SIZE];
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
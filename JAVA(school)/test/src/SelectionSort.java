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
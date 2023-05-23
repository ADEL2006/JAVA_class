public class SelectionSort {
    public int[] sort(int[] unsorted) {
        return this.doSelectionSorting(unsorted);
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int[] doSelectionSorting(int[] unsorted) {
        int n = unsorted.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (unsorted[j] < unsorted[minIndex]) {
                    minIndex = j;
                }
            }
            swap(unsorted, minIndex, i);
        }
        return unsorted;
    }
}
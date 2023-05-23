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
        // TODO : 선택 정렬을 통해서 unsorted 오름차순으로 정렬해서 반환하세요.
        int n = unsorted.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // 배열의 i번째 원소와 그 이후의 모든 원소를 비교하여 가장 작은 원소의 인덱스를 찾음
            for (int j = i + 1; j < n; j++) {
                if (unsorted[j] < unsorted[minIndex]) {
                    minIndex = j;
                }
            }

            // 가장 작은 원소를 현재 위치(i)의 원소와 교환
            swap(unsorted, minIndex, i);
        }

        return null;
    }


}
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public static int[] mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(nums, l, m);
            mergeSort(nums, m + 1, r);
            merge(nums, l, m, r);
        }
        return nums;
    }
    public static void merge(int[] arr, int l, int m, int r) {
        int l1 = m - l + 1;
        int l2 = r - m;
        int[] L = new int[l1];
        int[] R = new int[l2];
        for (int i = 0; i < l1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < l2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < l1 && j < l2) {
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < l1){
            arr[k++] = L[i++];
        }
        while(j < l2){
            arr[k++] = R[j++];
        }
    }
}
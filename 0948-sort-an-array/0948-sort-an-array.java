class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        // Create a temporary array to hold the merged result
        int[] temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, temp);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort the left and right halves
            mergeSort(nums, left, mid, temp);
            mergeSort(nums, mid + 1, right, temp);

            // Merge the sorted halves
            merge(nums, left, mid, right, temp);
        }
    }

    private void merge(int[] nums, int left, int mid, int right, int[] temp) {
        // Copy the array to a temporary array
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }

        int i = left;      // Starting index for left subarray
        int j = mid + 1;   // Starting index for right subarray
        int k = left;      // Starting index to be sorted

        // Merge the two subarrays back into nums
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                nums[k++] = temp[i++];
            } else {
                nums[k++] = temp[j++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (i <= mid) {
            nums[k++] = temp[i++];
        }

        // Copy any remaining elements from the right subarray
        while (j <= right) {
            nums[k++] = temp[j++];
        }
    }
}

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        if (nums == null || n == 0) return 0;

        if (n == 1) return nums[0];

        if (nums[0] < nums[n - 1]) return nums[0];

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (middle > 0 && nums[middle] < nums[middle - 1]) return nums[middle];

            if (nums[middle] > nums[right]) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }
}
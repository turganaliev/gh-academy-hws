class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int zeroInsertPos = 0;

        int twoInsertPos = n - 1;

        int i = 0;

        while (i <= twoInsertPos) {
            if (nums[i] == 0) {
                swap(nums, zeroInsertPos, i);
                zeroInsertPos++;
                i++;
            }
            else if (nums[i] == 1) {
                i++;
            }
            else {
                swap(nums, twoInsertPos, i);
                twoInsertPos--;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
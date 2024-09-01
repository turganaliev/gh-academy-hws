class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }

        int insertPosition = 0;

        for (int x : nums){
            if (x != 0){
                nums[insertPosition] = x;
                insertPosition++;
            }
        }
        while (insertPosition < nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }
    }
}
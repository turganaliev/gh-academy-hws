class Solution {
    public int subarraySum(int[] nums, int k) {
        int currentPrefixSum = 0;
        int answer = 0;

        Map<Integer, Integer> prefixSumSeenCount = new HashMap<>();

        prefixSumSeenCount.put(0, 1);

        for (int i = 0; i < nums.length; i++){
            currentPrefixSum += nums[i];

            answer += prefixSumSeenCount.getOrDefault(currentPrefixSum - k, 0);

            prefixSumSeenCount.put(currentPrefixSum, prefixSumSeenCount.getOrDefault(currentPrefixSum, 0) + 1);
        }
        return answer;
    }
}
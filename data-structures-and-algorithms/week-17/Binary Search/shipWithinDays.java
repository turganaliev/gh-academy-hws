class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int minCap = 0;
        int maxCap = 0;

        for (int w : weights) {
            minCap = Math.max(minCap, w);
            maxCap += w;
        }

        while (minCap < maxCap) {
            int days = 1;
            int sum = 0;
            int mid = minCap + (maxCap - minCap) / 2;

            for (int w : weights) {
                if (sum + w > mid) {
                    days++;
                    sum = 0;
                }
                sum += w;
            }
            if (days > D) {
                minCap = mid + 1;
            }
            else {
                maxCap = mid;
            }
        }
        return minCap;
    }
}
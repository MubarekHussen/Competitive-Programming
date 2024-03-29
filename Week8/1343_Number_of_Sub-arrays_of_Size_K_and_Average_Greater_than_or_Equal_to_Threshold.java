class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0, sum = 0;
		int min = k * threshold;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i < k - 1) {
                continue;
            }
            if (i > k - 1) {
                sum -= arr[i - k];
            }
            if (sum >= min) {
                count++;
            }
        }
        return (count);
    }
}

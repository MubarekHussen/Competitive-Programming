class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> prefix = new HashMap<>();
        int count = 0, curr = 0;

        prefix.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1) {
                count++;
            }
            prefix.put(count, prefix.getOrDefault(count, 0)+1);
            curr += prefix.getOrDefault(count - k, 0);
        }
        return (curr);
    }
}

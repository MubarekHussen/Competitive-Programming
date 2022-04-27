class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int i, j;
        ArrayList<Integer> target_count = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        
        for (int x = 0; x < nums.length; x++)
        {
            if (nums[x] == target)
            {
                target_count.add(x);
            }
        }
        
        return (target_count);
    }
}

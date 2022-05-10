class Solution
{
    public int minPairSum(int[] nums)
    {
        int max = 0;
        
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j; i++, j--)
        {
            max = Math.max(max, (nums[i] + nums[j]));
        }
        return (max);
    }
}

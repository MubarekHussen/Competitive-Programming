class Solution
{
    public int maxOperations(int[] nums, int k)
    {
        int ans = 0;
        
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j;)
        {
            int val = nums[i] + nums[j];
            if (val == k)
            {
                ans += 1;
                i++;
                j--;
            }
            else if (val < k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return (ans);
    }
}

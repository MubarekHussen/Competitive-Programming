class Solution
{
    public int[] rearrangeArray(int[] nums)
    {
        int indx = (nums.length - 1) / 2;
        int[] ans = new int[nums.length - indx];
        Arrays.sort(nums);
        for (int i = 2, j = 0; i < nums.length; i += 2, j++)
        {
            ans[j] = nums[i];
        }
        for (int i = 1, j = 2; i <= indx; i++, j += 2)
        {
            nums[j] = nums[i];
        }
        for (int i = 0, j = 1; i < ans.length; i++, j += 2)
        {
            nums[j] = ans[i];
        }
        return (ans);
    }
}

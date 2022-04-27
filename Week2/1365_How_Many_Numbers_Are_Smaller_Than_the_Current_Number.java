class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int i, j, count = 0;
        int[] smaller = new int[nums.length];
        
        for (i = 0; i < nums.length; i++)
        {
            for (j = 0; j < nums.length; j++)
            {
                if (nums[j] < nums[i] && j != i)
                {
                    ++count;
                }
            }
            
            smaller[i] = count;
            count = 0;
        }
        
        return (smaller);
    }
}

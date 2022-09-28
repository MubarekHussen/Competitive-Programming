class Solution {
    public int pivotIndex(int[] nums) {
        int lSum = 0;
        int rSum = 0;
        
        for (int i=0; i<nums.length; i++)
        {
            if (i == 0)
                lSum = 0;
            for (int l=0; l<i; l++)
                lSum = lSum + nums[l];
            for (int r=i+1; r<nums.length; r++)
                rSum = rSum + nums[r];
            if (lSum == rSum)
                return (i);
            lSum = 0;
            rSum = 0;
        }
         return (-1);
    }
}

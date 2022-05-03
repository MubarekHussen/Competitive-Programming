class Solution
{
    public String largestNumber(int[] nums)
    {
        
        String str1 = "";
        String str2 = "";
        String value = "";
        
        for (int i = 0; i < nums.length; i++)
        {
           for (int j = i + 1; j < nums.length; j++)
           {
               str1 = String.valueOf(nums[i]);
               str2 = String.valueOf(nums[j]);
               if ((str2 + str1).compareTo(str1 + str2) > 0)
               {
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
           }
            value += String.valueOf(nums[i]);
            if (nums.length >= 2)
            {
                if (nums[0] == 0 && nums[1] == 0)
                {
                    value = "0";
                }
            }
        }
        return(value);
    }
}

class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeCount = 0, strt = 0;
        int maxOne = 0, end = 0;

        for(end = 0; end < nums.length; end++) {
            if(nums[end] == 0) {
                zeCount++;
            }
           while(zeCount > k) {
               if(nums[strt] == 0) {
                   zeCount--;
               }
               strt++;
           }
            maxOne = Math.max(maxOne,end-strt+1);
        }
        return (maxOne);
    }
}

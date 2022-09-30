class Solution {
    public void moveZeroes(int[] nums) {
        int indx = 0;
        int chk = 0;

        while (chk < nums.length){
            if (nums[chk] != 0){
                int temp = nums[indx];
                nums[indx] = nums[chk];
                nums[chk] = temp;
                indx++;
            }
            chk++;
        }
    }
}

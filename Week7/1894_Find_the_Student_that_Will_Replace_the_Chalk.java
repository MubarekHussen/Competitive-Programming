class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;

        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
        }
        long remaining = (k % sum);

        for (int i = 0; i < chalk.length; i++) {
            if (remaining >= chalk[i]) {
                remaining -= chalk[i];
            }else {
                return (i);
            }
        }
        return (-1);
    }
}

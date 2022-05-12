class Solution
{
    public int maxCoins(int[] piles)
    {
        
        Arrays.sort(piles);
        int sum = 0;
        
        for (int i = 0, j = piles.length - 2; i <= j; i++, j -= 2)
        {
            sum += piles[j];
        }
        return (sum);
    }
}

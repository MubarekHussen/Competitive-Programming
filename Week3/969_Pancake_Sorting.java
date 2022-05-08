class Solution
{
    public List<Integer> pancakeSort(int[] arr)
    {
        
        List<Integer> k = new ArrayList<Integer>();
        int n = arr.length;
        int []index = new int[n+1];
        
        for(int i = 0; i < n; ++i)
        {
            index[arr[i]] = i+1;
        }
        
        for(int j = n; j > 0; --j)
        {
            int temp = index[j];
            if(temp == j)
                continue;
            
            else if(temp != 1)
            {
                for(int a = j; a > 0; --a)
                {
                    if(temp>=index[a])
                        index[a] = temp+1-index[a];
                }
                k.add(temp);
            }
            
            for(int a = j; a > 0; --a)
            {
                index[a] = j+1-index[a];
            }
            k.add(j);
        }
        return (k);
    }
}

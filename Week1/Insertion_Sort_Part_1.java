public static void insertionSort1(int n, List<Integer> arr)
{
    // Write your code here
    int key, i, j, limit;
    
    limit = arr.size() - 1;
    for (i = 1; i <= limit; i ++)
    {
        key = arr.get(i);
        j = i - 1;
        while (j >= 0 && arr.get(j) > key)
        {
            arr.set(j + 1, arr.get(j));
            j = j - 1;
            for (int k = 0; k <= limit; k++)
            {
                System.out.print(arr.get(k) + " ");
            }
            System.out.println();
            
        }
        arr.set(j + 1, key);
    }
    for (int k = 0; k <= limit; k++)
    {
        System.out.print(arr.get(k) + " ");
    }    
}

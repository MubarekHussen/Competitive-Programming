public static List<Integer> countingSort(List<Integer> arr)
{
    // Write your code here
    int count[] = new int [100];
    
    for (int i = 0; i < 100; ++i)
    {
        count[i] = 0;
    }
    
    for (int i = 0; i < arr.size(); ++i)
    {
        ++count[arr.get(i)];
    }
    
    List<Integer> list = new ArrayList<Integer>();
    
    for (Integer t : count)
    {
        list.add(t);
    }

    return (list);

}

class Solution
{
	int  select(int arr[], int i)
	{
        return arr[i];
	}
	
	void selectionSort(int arr[], int n)
	{
	    for (int out = 0;out < n-1; out++)
	    {
	        int min = out;
	        for (int in = out + 1; in < n; in++)
	        {
	            if(arr[min]>arr[in])
	            {
	                int temp = arr[min];
	                arr[min] = arr[in];
	                arr[in] = temp;
	            }
	        }
	        select(arr,out);
	    }
	}
}

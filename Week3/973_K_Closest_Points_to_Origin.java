public class customComparator implements Comparator<int []>
{
    public int compare(int []pt1, int []pt2)
    {
        int dis1 = (int) (Math.pow(pt1[0],2) + Math.pow(pt1[1], 2));
        int dis2 = (int) (Math.pow(pt2[0],2) + Math.pow(pt2[1], 2));
        return  (dis1 - dis2);
    }
}
class Solution 
{
    public int[][] kClosest(int[][] points, int k)
    {
        Arrays.sort(points, new customComparator());
        return (Arrays.copyOfRange(points, 0, k));
    }
}

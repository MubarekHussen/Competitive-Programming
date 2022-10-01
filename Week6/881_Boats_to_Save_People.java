class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int start = 0;
        int end = people.length - 1;
        int count = 0;

        Arrays.sort(people);
        while(start <= end) {
           int sum = people[start] + people[end];
            if (sum <= limit){
                start++;
            }
            count++;
            end--;
        }
        return (count);
    }
}

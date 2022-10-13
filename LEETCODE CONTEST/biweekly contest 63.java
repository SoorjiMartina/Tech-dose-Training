class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        int m = seats.length;
        int n = students.length;
        for(int i=0;i<m;i++)
        {
            if(seats[i]<students[i])
            {
                count= count+ students[i]-seats[i];
            }
            else
            {
                count = count +seats[i]-students[i];
            }
        }
        return count;
        
    }
}

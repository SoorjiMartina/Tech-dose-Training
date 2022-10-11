class Solution {
    public int mostFrequentEven(int[] nums) {
   int max=0,k=0;
        int count[] = new int[100001];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                  count[nums[i]]++;
            }
        }
        for(int i=0;i<100001;i++)
        {
            if(count[i]>max)
            {
                max=count[i];
                k=i;
            }
        }
        if(max==0)
        {
            return -1;
        }
        return k;
    }
}

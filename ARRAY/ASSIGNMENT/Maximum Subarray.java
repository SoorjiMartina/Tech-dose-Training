class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max = Integer.MIN_VALUE;
        for(int val:nums)
        {
            sum+=val;
            if(sum>max)
            {
                max= sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
}

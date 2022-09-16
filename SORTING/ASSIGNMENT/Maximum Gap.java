class Solution {
    public int maximumGap(int[] nums) {
         int n= nums.length;
        for(int i=0;i<n;i++)
        {
            int midindex=i;
            for(int j=i+1;j<n;j++)
            {
                if(nums[midindex]>nums[j])
                {
                    midindex=j;
                }
            }
            int temp =nums[midindex];
                    nums[midindex]=nums[i];
                    nums[i]=temp;
        }
        int sub =Integer.MIN_VALUE;
        if(n<2)
        {
            sub=0;
        }
        if(n>=2)
        {
            for(int i=1;i<n;i++)
            {
                if((nums[i]-nums[i-1])>sub){
                sub = nums[i]-nums[i-1];
                }
            }
        }
             return sub;
        }
        
}

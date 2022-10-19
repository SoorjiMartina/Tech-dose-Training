class Solution {
    public int maxAscendingSum(int[] nums) {
        int  temp =nums[0],max= nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                temp+=nums[i];
            }
            else
            {
                temp=nums[i];
            }
        max=Math.max(max,temp);
        }
        return max;
    }
}

class Solution {
   public void sortColors(int[] nums) {
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
      int temp = nums[midindex];
      nums[midindex]=nums[i];
      nums[i]=temp;
      }
    }
}

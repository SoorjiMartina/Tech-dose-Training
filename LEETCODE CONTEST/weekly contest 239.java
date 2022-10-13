class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min =101;
        for(int i=start;i<nums.length;i++){
            if(nums[i]==target)
              min=Math.min(Math.abs(i-start),min);
        }
        return min;
    }
}

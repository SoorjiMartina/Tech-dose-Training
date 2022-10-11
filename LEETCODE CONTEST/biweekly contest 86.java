class Solution {
    public boolean findSubarrays(int[] nums) {
        int[] sum = new int[nums.length-1];
        for(int i = 0;i < nums.length-1 ;i++){
            sum[i] = nums[i] + nums[i+1];
        }
        for(int i = 0 ; i< sum.length-1 ;i++){
            for(int j =i+1 ;j<sum.length;j++){
                if(sum[i] == sum[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

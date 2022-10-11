class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            nums[i]= nums[i-1]+nums[i];
        }
        
        int [] ans = new int [queries.length];
        for(int i=0;i<queries.length;i++){
            int sum=0,j=0;
        for(j=0;j<nums.length;j++)
        {
            if(sum +nums[j] > queries[i]) break;
        }
            ans[i]= j;
        }
          
        return ans;
    }
}

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int cnt [] = new int [101];
        int ans [] = new int [2];
        for(int num : nums)
        {
            cnt[num]++;
            if(cnt[num]==2)
            {
                cnt[num]=0;
                ans[0]++;
                ans[1]--;
            }
            else
            {
                ans[1]++;
            }
        }
        return ans;
    }
}

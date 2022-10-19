class Solution {
    public int findGCD(int[] nums) {
       int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return gcd(min,max);
    }
    private int gcd(int a, int b)
    {
        return (a==0) ? b:gcd(b%a,a);
    }
}

class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        int ans=reverse(num);
        int res=reverse(ans);
        return res==num;
    }
    public int reverse(int num){
        int ans=0;
        while(num>0){
        int rem=num%10;
        ans=(ans*10)+rem;
        num/=10;
        }
        return ans;
    }
}

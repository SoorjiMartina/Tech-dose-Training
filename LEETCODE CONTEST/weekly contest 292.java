class Solution {
    public String largestGoodInteger(String s) {
        String ans="";
        for(int i=1;i!=s.length()-1;i++)
        {
            if(s.charAt(i-1)==s.charAt(i) && s.charAt(i)==s.charAt(i+1))
            {
                if(ans.length()==0)
                {
                    ans = s.substring(i - 1, i + 2);
                } 
                else if (s.charAt(i) > ans.charAt(0))
                {
                    ans = s.substring(i - 1, i + 2);
                }
            }
        }
        return ans;
    }
}

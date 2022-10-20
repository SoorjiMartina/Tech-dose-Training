class Solution {
    public String firstPalindrome(String[] words) {
        int len = words.length;
        String str="";
        for(int i=0;i<len;i++)
        {
           if(ispalindrome(words[i]))
           {
               return words[i];
           }
        }
        return str;
    }
    private boolean ispalindrome(String s)
    {
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)!= s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}

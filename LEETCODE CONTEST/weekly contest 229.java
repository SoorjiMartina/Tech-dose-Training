class Solution {
    public String mergeAlternately(String word1, String word2) {
    String s ="";
        int count =0;
        int rcount=0;
        for(int i=0;i<word1.length()+word2.length();i++)
        {
            if(i<word1.length())
            {
                s+=word1.charAt(count);
                count++;
            }
            if(i<word2.length())
            {
                s+=word2.charAt(rcount);
                rcount++;
            }
        }
        return s;
    }
}

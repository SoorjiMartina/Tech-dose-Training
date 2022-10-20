class Solution {
    public int prefixCount(String[] words, String pref) {
       int len = words.length;
        int len1 = pref.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(words[i].length()>=len1){
            String str = words[i].substring(0,len1);
            if(str.equals(pref))
            {
                count++;
            }
        }
        }
       return count; 
}
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int maxlength=0 ,st =0;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                st= Math.max(st,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            maxlength=Math.max(maxlength,i-st+1);
        }
        return maxlength;
    }
}

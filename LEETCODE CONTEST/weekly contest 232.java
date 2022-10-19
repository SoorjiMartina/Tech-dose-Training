class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
     int diff[] = new int[2];
    int count =0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(count==2)
                {
                return false;
                }
            
            diff[count]=i;
                count++;
            }
            
        }
        return (s1.charAt(diff[0])==s2.charAt(diff[1])) && (s1.charAt(diff[1])==s2.charAt(diff[0]));
        }
}

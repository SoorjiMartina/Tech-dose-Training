class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count=0;
        for(int i=0;i<s.length()-k+1;i++)
        {
            String str = s.substring(i,i+k);
            int temp = Integer.valueOf(str);
            if(temp ==0)
            {
                continue;
            }
            if(num%temp==0)
            {
                count++;
            }
        }
        return count;
        
    }
}

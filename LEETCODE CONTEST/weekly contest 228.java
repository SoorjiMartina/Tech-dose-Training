class Solution {
    public int minOperations(String s) {
        int count =0;
        int  rcount =0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0){
            if(s.charAt(i)!='0')
            {
                count++;
            }
            else
            {
                rcount++;
            }
            }
            else{ 
                if(s.charAt(i)!='1')
            {
                count++;
            }
            else
            {
                rcount++;
            }
        }
        }
       return Math.min(count,rcount);
    }
}

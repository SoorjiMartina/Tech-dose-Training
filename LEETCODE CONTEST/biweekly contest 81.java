class Solution {
    public int countAsterisks(String s) {
       boolean flag = true;
        int count=0;
        for(char ch : s.toCharArray())
        {
            if(ch=='*' && flag)
            {
                count++;
            }
            if(ch=='|')
            {
                flag =! flag;
            }
        }
        
       return  count; 
    }
}

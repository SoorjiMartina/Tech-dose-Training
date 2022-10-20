class Solution {
    public String removeDigit(String number, char digit) {
        int len = number.length();
        int  last = number.lastIndexOf(digit);
        for(int i=0;i<len-1;i++)
        {
            if(number.charAt(i)== digit&& number.charAt(i)<number.charAt(i
+1))
            {
                return number.substring(0,i)+number.substring(i+1);
            }}
        return number.substring(0,last)+number.substring(last+1);
    }
}

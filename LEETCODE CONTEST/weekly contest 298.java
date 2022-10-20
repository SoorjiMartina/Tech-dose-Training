class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
        {
            set.add(ch);
        }
        for(char i='Z';i>='A';i--)
        {
            if(set.contains(i) && set.contains(Character.toLowerCase(i)))
            {
                return  Character.toString(i);]
            }
        }
        return "";
    }
}

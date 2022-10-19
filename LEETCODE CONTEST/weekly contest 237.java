class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet();
        for(char a :sentence.toCharArray())
        {
            set.add(a);
        }
        if(set.size()==26){
         return true;
        }
            return false;
        
    }
}

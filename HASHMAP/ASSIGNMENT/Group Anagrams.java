class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String,List<String>> m= new HashMap<>();
        for(String s : str){
            char ch [] = s.toCharArray();
            Arrays.sort(ch);
            String st = String.valueOf(ch);
            if(!m.containsKey(st))
            {
                m.put(st,new ArrayList<>());
            }
            m.get(st).add(s);
        }
        return new ArrayList<>(m.values());
        
        
    }
}

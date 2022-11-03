class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
         PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        String str ="";
        while(!pq.isEmpty())
        {
            char ch = pq.poll();
            for(int i=0;i<map.get(ch);i++)
            {
                str+=ch;
            }
        }
        return str;
    }
}

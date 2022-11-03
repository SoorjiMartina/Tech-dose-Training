class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
         PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Character ch : map.keySet())
        {
            pq.add(ch);
        }
        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty())
        {
            char c = pq.poll();
            int count = map.get(c);
            while(count-->0)
            {
                str.append(c);
            }
        }
        return str.toString();
    }
}

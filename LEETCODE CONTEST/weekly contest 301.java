class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if(amount[0]+amount[1] >amount[2])
        {
            return ((amount[0]+amount[1]+amount[2])/2 +(amount[0]+amount[1]+amount[2])%2);
        }
        else
        {
            return amount[2];
        }
        
    }
}

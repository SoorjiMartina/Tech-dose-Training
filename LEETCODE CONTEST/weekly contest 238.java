class Solution {
    public int sumBase(int n, int k) {
       return n<k ? n : n%k +sumBase(n/k,k);
    }
}

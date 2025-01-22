class Solution {
    public int arrangeCoins(int n) {
        return (int)Math.floor(-0.5+ Math.sqrt((long)2*n+0.5));      
    }
}
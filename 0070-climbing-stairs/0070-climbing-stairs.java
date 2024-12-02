class Solution {
    HashMap<Integer,Integer> hmap=new HashMap<>();
    public int climbStairs(int n) {        
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(hmap.containsKey(n))
            return hmap.get(n);
        
        hmap.put(n,climbStairs(n-1)+climbStairs(n-2));
        return hmap.get(n);

    }
}
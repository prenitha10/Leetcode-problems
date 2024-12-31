class Solution {
    public int climbStairs(int n) {
        HashMap<Integer ,Integer> hmap=new HashMap<>();
        return rec(n,hmap);       
    }
    public int rec(int n,HashMap<Integer ,Integer> hmap)
    {
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(hmap.containsKey(n))
        {
            return hmap.get(n);
        }
        int val=rec(n-1,hmap)+rec(n-2,hmap);
        hmap.put(n,val);
        return val;
    }
}
class Solution {
    public int tribonacci(int n) 
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        return rec(n,hmap);        
    }
    public int rec(int n,HashMap<Integer,Integer> hmap)
    {
        int val;
        
        if(n==0)
            return 0;
        if(n<=2)
            return 1;
        if(hmap.containsKey(n))
            return hmap.get(n);
        val=rec(n-1,hmap)+rec(n-2,hmap)+rec(n-3,hmap);
        hmap.put(n,val);
        return val;
    }
}
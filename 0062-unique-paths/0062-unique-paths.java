class Solution {
    public int uniquePaths(int m, int n) {
        HashMap<String,Integer> hmap=new HashMap<>();
        return rec(m,n,hmap);        
    }
    int rec(int m,int n,HashMap<String,Integer> hmap)
    {
        String key=m+ "," +n;
        if(hmap.containsKey(key))
        {
            return hmap.get(key);
        }
        if(m==1 || n==1)
            return 1;
        int val=rec(m-1,n,hmap)+rec(m,n-1,hmap);
        hmap.put(key,val);
        return val;
    }
}
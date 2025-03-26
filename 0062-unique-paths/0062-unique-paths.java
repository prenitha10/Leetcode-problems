class Solution {
    public int uniquePaths(int m, int n) 
    {
        HashMap<String,Integer> hmap=new HashMap<>();
        return backtrack(m,n,hmap);        
    }
    int backtrack(int m,int n,HashMap<String,Integer> hmap)
    {
        String key=m+" "+n;
        if(hmap.containsKey(key))
            return hmap.get(key);
        if(m==1||n==1)
            return 1;
        int val= backtrack(m-1,n,hmap)+ backtrack(m,n-1,hmap);
        hmap.put(key,val);
        return val;
    }
    
}
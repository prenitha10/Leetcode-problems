class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hmap=new HashSet<>();
        return (recurse(hmap,n));
    }
    public static boolean recurse(HashSet<Integer> hmap,int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=(rem*rem);
            n=n/10;
        }
        if(sum==1)
        {
            return true;
        }
        else if(hmap.contains(sum))
        {
            return false;
        }
        hmap.add(sum);
        n=sum;
        return recurse(hmap,n);
    }
}
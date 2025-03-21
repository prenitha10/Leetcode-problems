class Solution {
    public boolean isHappy(int n) 
    {
        HashSet<Integer> hsum=new HashSet<>();
        return(sum(hsum,n));              
    }
    public boolean sum(HashSet<Integer> hsum,int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=(rem*rem);
            n=n/10;
        } 
        if(sum==1)
            return true;
        if(hsum.contains(sum))
            return false;
        hsum.add(sum); 
        n=sum;
        return sum(hsum,n);
    }
}
class Solution {
    public int reverse(int x) {
        int rem=0;
        int sum=0;
        int org=x;
        if(x<0)
        {
            x=x*-1;
        }
        while(x>0)
        {
            rem=x%10;
            if(sum<Integer.MIN_VALUE/10|| sum>Integer.MAX_VALUE/10)
                return 0;
            sum=sum*10+rem;
            x=x/10;
        }
        if(org<0)
        {
            sum=sum*-1;
        }
        return sum;
    }
}
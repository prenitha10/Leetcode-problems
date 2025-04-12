class Solution {
    public int addDigits(int num) {
        int number=recsum(num);
        return number;        
    }
    public int recsum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        if(sum<=9)
            return sum;
        return recsum(sum);
    }
}
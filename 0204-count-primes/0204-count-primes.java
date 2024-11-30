class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n==1||n==0)
        {
            return count;
        }
        boolean[] prime=new boolean[n];
        for(int i=2;i<=n;i++)
        {   
            if((long)i*i<n)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    prime[j]=true;                
                } 
            }         
               
        }  
        for(int i=2;i<=prime.length-1;i++)
        {
            if(prime[i]==false)
            {
                count++;
            }
        }
        return count;
        
    }
}
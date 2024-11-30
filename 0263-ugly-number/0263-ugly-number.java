class Solution {
    public boolean isUgly(int n) {
        while(n>0)
        {
            if(n==1)
            {
                return true;
            } 
            if(n%2==0)
            {
                n=n/2;
                continue;
            }
            if(n%3==0)
            {
                n=n/3;
                continue;
            }
            if(n%5==0)
            {
                n=n/5;
                continue;
            }   
            return false;                   
        }         
        return false;    
        
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int rem=0;
        int newnum=0;
        if(x<0)
            return false;
        while(x>0)
        {
            rem=x%10;
            newnum=newnum*10+rem;
            x=x/10;
        }
        if(newnum!=num)
            return false;
        else return true;
    }
}
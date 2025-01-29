class Solution {
    public boolean isPalindrome(int x) {
        int number=x;
        int ans=0;
        while(x>0)
        {
            ans=(ans*10)+x%10;
            x=x/10;
        }
        if(number==ans)
            return true;
        return false;
    }
}
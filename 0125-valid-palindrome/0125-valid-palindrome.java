class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length();
        int k=0;
        char[] ch=s.toCharArray();
        char[] fin=new char[n];
        for(int i=0;i<n;i++)
        {
            if (Character.isLetterOrDigit(ch[i]))
            {
                fin[k]=ch[i];
                k++;
            }
        }
        int left=0;
        int right=k-1;
        while(left<right)
        {
            if(fin[left]!=fin[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
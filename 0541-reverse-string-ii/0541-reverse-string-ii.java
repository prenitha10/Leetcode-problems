class Solution {
    public String reverseStr(String s, int k) {
       char[] ch=s.toCharArray();
       for(int i=0;i<=s.length()-1;i=i+(k*2))
       {
            int start=i;
            int end=Math.min(i+k-1,s.length()-1);
            while(start<end)
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
       } 
       return new String(ch);
    }
}
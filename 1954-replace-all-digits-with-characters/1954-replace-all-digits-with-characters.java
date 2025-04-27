class Solution {
    public String replaceDigits(String s) {
        char[] ch=s.toCharArray();
        for(int i=1;i<s.length();i=i+2)
        {
            int temp=ch[i]-'0';
            ch[i]=(char)(temp+ch[i-1]);
        }
        return String.valueOf(ch);
    }
}
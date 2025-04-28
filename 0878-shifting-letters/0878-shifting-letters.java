class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int start=0;
        char[] ch=s.toCharArray();
        for(int i=shifts.length-1;i>0;i--)
        {
            shifts[i-1]+=shifts[i]%26;
        }
        for(int i=0;i<s.length();i++)
        {
            int temp = ch[i] - 'a';
            temp = (temp + shifts[i]) % 26;
            ch[i] = (char)(temp + 'a');
        }
        return String.valueOf(ch);
    }
}
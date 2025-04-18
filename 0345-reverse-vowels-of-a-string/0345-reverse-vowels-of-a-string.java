class Solution {
    boolean isVowel(char c) {
    return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
           c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] ch=s.toCharArray();
        while(left<right)
        {
           if (isVowel(ch[left]) && isVowel(ch[right]))
           {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
           }
           else if(isVowel(ch[left]))
           {
                right--;
           }
           else if(isVowel(ch[right]))
           {
                left++;
           }
           else
           {
            left++;
            right--;
           }
        }
        return String.valueOf(ch);
    }
}
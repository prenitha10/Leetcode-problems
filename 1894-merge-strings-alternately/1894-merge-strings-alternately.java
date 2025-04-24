class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        char[] ch=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        int min=0;
        int max=0;
        if(word1.length()>=word2.length())
        {
            max=word2.length();
            min=word1.length()-word2.length();
        }
        else
        {
            max=word1.length();
            min=word2.length()-word1.length();
        }
        for(int i=0;i<max;i++)
        {
            sb.append(ch[i]);
            sb.append(ch2[i]);
        }
        for(int i=0;i<min;i++)
        {
            if(word1.length()>=word2.length())
                sb.append(ch[max+i]);
            else
                sb.append(ch2[max+i]);
        }
        return String.valueOf(sb);
        
    }
}
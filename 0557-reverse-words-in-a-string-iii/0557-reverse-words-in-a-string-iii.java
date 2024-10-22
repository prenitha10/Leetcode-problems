class Solution {
    public String reverseWords(String s) {
        int start = 0;
        char[] ch = s.toCharArray();
        for (int end = 0; end <= ch.length; end++) {
            if (end == ch.length || ch[end] == ' ') {
                rev(ch, start, end - 1);
                start = end + 1;
            }
        }
        return new String(ch);
    }

    void rev(char[] ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}

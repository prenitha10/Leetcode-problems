class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        reverse(left, right, ch);
        int start = 0;
        for (int i = 0; i <= right; i++) {
            if (ch[i] == ' ') {
                reverse(start, i - 1, ch);
                while (i + 1 <= right && ch[i + 1] == ' ') {
                    i++;
                }
                start = i + 1;
            }
        }
        reverse(start, right, ch);
        
        // Remove extra spaces
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            if (c == ' ' && sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
                continue; // Skip extra spaces
            }
            sb.append(c);
        }
        
        return sb.toString();
    }
    
    void reverse(int left, int right, char[] ch) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
}

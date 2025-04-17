class Solution {
    public String removeStars(String s) {
        char[] ch=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='*')
                stack.pop();
            else
                stack.push(ch[i]);
        }
        StringBuilder sb=new StringBuilder();
        for(char ele:stack)
            sb.append(ele);
        return String.valueOf(sb);
    }
}
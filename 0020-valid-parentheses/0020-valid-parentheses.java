class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='(')
                stack.push(')');
            else if(ch[i]=='{')
                stack.push('}');
            else if(ch[i]=='[')
                stack.push(']');
            else if(stack.isEmpty()||stack.pop()!=ch[i])
                return false;
        }
        return stack.isEmpty();
    }
}
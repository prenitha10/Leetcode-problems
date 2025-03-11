class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack=new ArrayDeque<>();
        for(String ele:path.split("/"))
        {
            if(ele.isEmpty()||".".equals(ele))
            {
                continue;
            }
            if("..".equals(ele))
            {
                if(!stack.isEmpty())
                {
                    stack.removeLast();
                }
            }
            else
            {
                stack.add(ele);
            }
        }
        return "/" + String.join("/", stack);
    }
}
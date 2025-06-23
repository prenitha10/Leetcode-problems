class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(String val:operations)
        {
            if(val.equals("C"))
            {
                stack.pop();

            }
            else if(val.equals("D"))
            {
                int ele=(int)stack.peek()*2;
                stack.push(ele);
            }
            else if(val.equals("+"))
            {
                int top=stack.pop();
                int newTop=top+stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else
            {
                stack.push(Integer.parseInt(val));
            }
        }
        for(int ele:stack)
        {
            sum+=ele;
        }
        return sum;
    }
}
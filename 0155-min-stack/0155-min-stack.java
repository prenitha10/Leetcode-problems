class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> ms=new Stack<>();
    int ele=0;
    public void push(int val) {
        stack.push(val);
        if(ms.isEmpty() || val<=ms.peek())
        {
            ms.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty())
            ele=stack.pop();
        if(ele==ms.peek())
            ms.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
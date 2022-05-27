class MinStack
{
    private LinkedList<ArrayList> stack;
    int min;
    
    public MinStack()
    {
        stack = new LinkedList<ArrayList>();
    }
    
    public void push(int val)
    {
        ArrayList <Integer> list = new ArrayList<Integer>(2);
        list.add(0,val);
        min = val;
        if (!stack.isEmpty())
        {
            min = Math.min((int)stack.peek().get(1), min);
        }
        list.add(1,min);
        stack.push(list);
    }
    
    public void pop()
    {
        stack.pop();
    }
    
    public int top()
    {
        return ((int)stack.peek().get(0));
    }
    
    public int getMin()
    {
        return ((int)stack.peek().get(1));
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

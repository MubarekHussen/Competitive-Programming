class MyQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int x) {
        while(!stack2.empty()) {
        stack1.push(stack2.pop());
        }
        stack1.push(x);
    }

    public int pop() {
        while(!stack1.empty()) {
        stack2.push(stack1.pop());
        }
        return (stack2.pop());
    }

    public int peek() {
        while(!stack1.empty()) {
        stack2.push(stack1.pop());
        }
        return (stack2.peek());
    }

    public boolean empty() {
        return (stack1.empty() && stack2.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

class LinStack
{
        private LinkedList<Integer> stack;
        
        public LinStack (){
            stack = new LinkedList<Integer>();
        }
        
        public void push(Integer str) {
            stack.push(str);
        }
        
        public Integer pop() {
            return stack.pop();
        }
        
        public Integer peek() {
            return stack.peek();
        }
}

class Solution
{
    public int evalRPN(String[] tokens)
    {
        LinStack stack = new LinStack();
        for (int i = 0; i < tokens.length; i++)
        {
            String opr = tokens[i];
            int res;
            if (opr.equals("+"))
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                res = (val2) + (val1);
                stack.push(res);   
            }
            else if (opr.equals("*"))
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                res = (val2) * (val1);
                stack.push(res);
            }
            else if (opr.equals("/"))
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                res = (val2) / (val1);
                stack.push(res);
            }
            else if (opr.equals("-"))
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                res = (val2) - (val1);
                stack.push(res);
            }
            else
            {
                stack.push(Integer.valueOf(tokens[i]));
            }
            
        }
        int ans = stack.peek();
        return (ans);
    }
}

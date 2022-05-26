class Solution
{
    public boolean isValid(String s)
    {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++)
        {
            char val = s.charAt(i);
            if (val == '(' || val == '[' || val == '{')
            {
                stack.push(val);
            }
            else
            {
            if (stack.isEmpty())
                return (false);
        
            char rev = stack.pop();
            if ((val == ')' && rev != '(') || (val == ']' && rev != '[') || (val == '}' && rev != '{'))
                return (false);
            }
        }
        return (stack.isEmpty());
    }
}

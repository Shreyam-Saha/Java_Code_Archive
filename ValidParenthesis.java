
/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


*/


class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<Character>();
        if(s.charAt(0) == '}'|| s.charAt(0) == ')'|| s.charAt(0) == ']')
            return false;
        for(int i = 0;i<s.length();i++)
        {
            
            
            
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
            {
                bracket.push(s.charAt(i));
                continue;
            }
            if(bracket.empty() && (s.charAt(i) =='}'||s.charAt(i) ==')'||s.charAt(i) ==']'))
                return false; 
            else if (s.charAt(i) =='}' && bracket.peek()=='{')
                bracket.pop();
             else if (s.charAt(i) ==')' && bracket.peek()=='(')
                bracket.pop();
             else if (s.charAt(i) ==']' && bracket.peek()=='[')
                bracket.pop();
            else
                bracket.push(s.charAt(i));
            
           
            
        }
        
        return bracket.empty();
    }
}

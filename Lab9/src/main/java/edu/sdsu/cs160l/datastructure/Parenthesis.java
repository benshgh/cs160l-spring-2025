package edu.sdsu.cs160l.datastructure;

import java.util.Stack;

// TODO implement the below function (2 points)
//  use Test Class to test your implementation
public class Parenthesis {
    /**
     * @param brackets contains a sequence of Characters '(' or ')'
     *                 eg : '((()))' is valid
     *                 '())' is invalid
     *                 ')(' is invalid
     *                 Check the test class for more examples
     * @return true is the brackets are balanced else false
     */
    public boolean isBalanced(String brackets) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if ( ch == ')') {
                if(st.isEmpty())
                    return false;
                else
                    st.pop();
            }
        }
        return st.isEmpty();
        }
}

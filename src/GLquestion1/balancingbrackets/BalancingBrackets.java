package GLquestion1.balancingbrackets;

import java.util.Stack;

public class BalancingBrackets {
    public static boolean balanced(String brackets){
        Stack<Character> stack = new Stack<>();
        if(brackets.length()%2 !=0){
            return false;
        }
        for(int i=0; i<brackets.length(); i++){
            char ele = brackets.charAt(i);
            if(ele == '(' || ele=='{' || ele =='['){
                stack.push(ele);
                continue;
            }
            try{
                if((!stack.isEmpty() && ((stack.peek() == '{') && (ele == '}'))) || (( stack.peek() == '[') && (ele == ']')) || ((stack.peek() == '(') && (ele == ')'))){
                    stack.pop();
                    if(stack.isEmpty())
                        return true;
                }
                else {
                    return false;
                }
            } catch(NullPointerException e){
                return false;
            }
        }
        return false;
    }

}

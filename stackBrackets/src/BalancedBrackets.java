import java.util.Stack;

public class BalancedBrackets {

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;  // unmatched closing bracket
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // if true, all brackets matched
    }
}

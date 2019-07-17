import java.util.Stack;

public class BalancedParentheses {
    private static char[][] TOKENS; // Assign it yourself I am having fun;

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : expression.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(Character OpenTerm, char closeTerm) {
        for (char[] array : TOKENS) {
            if (array[0] == OpenTerm) {
                return array[1] == closeTerm;
            }
        }
        return false;
    }

    private static boolean isOpenTerm(char c) {
        for (char[] array : TOKENS) {
            if (array[0] == c) {
                return true;
            }
        }
        return false;
    }
}

import java.util.Stack;

public class isBalanced {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        int index = 0;

        while (index < expression.length()) {
            char ch = expression.charAt(index);

            if (isOpen(ch)) {
                stack.push(ch);
            } else if (isClose(ch)) {
                if (stack.isEmpty()) {
                    isBalanced = false;
                }

                char top = stack.pop();
                if (!areMatching(top, ch)) {
                    isBalanced = false;
                }
            }

            index++;
        }

        return stack.isEmpty() && isBalanced;
    }

    public static boolean isOpen(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }
        return false;
    }

    public static boolean isClose(char c) {
        if (c == ')' || c == '}' || c == ']') {
            return true;
        }
        return false;
    }

    public static boolean areMatching(char c1, char c2) {
        if ((c1 == '(' && c2 == ')') ||
                (c1 == '{' && c2 == '}') ||
                (c1 == '[' && c2 == ']')) {
            return true;
        }
        return false;
    }
}

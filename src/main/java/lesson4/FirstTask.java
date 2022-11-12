package lesson4;

import java.util.Stack;

public class FirstTask {
    public boolean isValid(String[] s) {
        String str = "()[]{}";
        Stack<Character> brackets = new Stack<>();

        if (str.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                brackets.push(x);
            } else {
                if (brackets.isEmpty()) {
                    return false;
                }
                if ((x == ')' && brackets.peek() == '(') ||
                        (x == '}' && brackets.peek() == '{') ||
                        (x == ']' && brackets.peek() == '[')) {
                    brackets.pop();
                } else {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}

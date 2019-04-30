package datastructures;

import java.util.*;

public class JavaStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input) && isMatched(input));
        }
    }

    private static boolean isBalanced(String token) {
        List<Character> open = new ArrayList<>();
        List<Character> close = new ArrayList<>();
        for (char c : token.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                open.add(c);
            }
            if (c == '}' || c == ']' || c == ')') {
                close.add(c);
            }
        }
        return open.size() == close.size();
    }

    private static boolean isMatched(String token) {
        Stack<Character> stack = new Stack<>();
        for (char c : token.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.add(c);
            }
            try {
                if (c == '}') return stack.pop() == '{';
                if (c == ']') return stack.pop() == '[';
                if (c == ')') return stack.pop() == '(';
            } catch (EmptyStackException e) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}




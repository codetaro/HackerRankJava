package datastructures;

import java.util.*;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            isBalanced(input);
        }

    }

    private static boolean isBalanced(String token) {
        Stack<Character> stack = new Stack<>();
        for (char c : token.toCharArray()) {
            stack.add(c);
        }
        return true;
    }
}




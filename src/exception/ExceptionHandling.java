package exception;

import java.io.*;
import java.util.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        try {
            int op1 = scanner.nextInt();
            int op2 = scanner.nextInt();
            System.out.println(op1 / op2);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


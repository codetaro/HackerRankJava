package strings;

import java.io.*;
import java.util.*;

public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.split("[\\s!,?._'@]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}


package advanced;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class JavaMD5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        try {
//            MessageDigest md = MessageDigest.getInstance("MD5");
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            byte[] output = sha.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : output) {
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

package interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long quo = n / s.length();
        long rem = n % s.length();
        long numOfA = s.chars().filter(c -> c == 'a').count();

        long part1 = numOfA * quo;
        long part2 = partialCount(s, rem, 'a');

        return part1 + part2;
    }

    static long partialCount(String s, long l, char c) {

        char[] cArr = s.toCharArray();
        long result = 0L;
        for (int i = 0; i < l; i++) {
            if (cArr[i] == c) result++;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile.txt"));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

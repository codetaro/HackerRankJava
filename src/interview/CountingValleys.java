package interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleyCount = 0;

        char[] cArr = s.toCharArray();
        int[] iArr = new int[n];
        for (int i = 0; i < n; i++) {
            if (cArr[i] == 'U') iArr[i] = 1;
            if (cArr[i] == 'D') iArr[i] = -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += iArr[i];
            if (sum == 0 && cArr[i] == 'U') valleyCount++;
        }

        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

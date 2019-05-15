package interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int n = q.length;
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            int diff = q[i] - p[i];
            if (diff > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        int numOfBribes = 0;
        for (int i = 0; i < n; i++) {
            // q[i]-1 is the original index.
            // We only care about bribe the previous one for each position
            for (int j = Math.max(0, q[i] - 1 - 1); j < i; j++) {
                if (q[j] > q[i]) numOfBribes++;
            }
        }
        System.out.println(numOfBribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

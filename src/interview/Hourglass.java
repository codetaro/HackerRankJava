package interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hourglass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxHgSum = -81;

        int n = arr[0].length;
        int a, b, c, d, e, f, g;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                a = arr[i][j];
                b = arr[i][j + 1];
                c = arr[i][j + 2];
                d = arr[i + 1][j + 1];
                e = arr[i + 2][j];
                f = arr[i + 2][j + 1];
                g = arr[i + 2][j + 2];
                int sum = a + b + c + d + e + f + g;
                if (sum > maxHgSum) maxHgSum = sum;
            }
        }

        return maxHgSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

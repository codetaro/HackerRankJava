package datastructures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        getLargestSum(arr);
    }

    public static void getLargestSum(int[][] arr) {
        int sum = -81;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;
        int newSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 2) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j < arr[i].length - 2) {
                        a = arr[i][j];
                        b = arr[i][j + 1];
                        c = arr[i][j + 2];
                        d = arr[i + 1][j + 1];
                        e = arr[i + 2][j];
                        f = arr[i + 2][j + 1];
                        g = arr[i + 2][j + 2];
                    }
                    newSum = a + b + c + d + e + f + g;
                    if (newSum > sum) {
                        sum = newSum;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

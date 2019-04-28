package datastructures;

import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[] iArr = new int[n];
        String[] sArr = scan.nextLine().split("\\s");
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        System.out.println(countNegativeSubarrays(iArr));
    }

    public static int sumSubarray(int[] arr, int a, int b) {
        int sum = 0;
        for (int i = a; i < b + 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int countNegativeSubarrays(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (sumSubarray(arr, i, j) < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}


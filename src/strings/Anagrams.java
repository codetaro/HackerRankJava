package strings;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();
        if (arrA.length != arrB.length) {
            return false;
        } else {
            bubbleSort(arrA);
            bubbleSort(arrB);
            for (int i = 0; i < arrA.length; i++) {
                if (arrA[i] != arrB[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    private static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

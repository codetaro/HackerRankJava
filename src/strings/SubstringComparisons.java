package strings;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0, k);
        largest = smallest;
        for (int i = 0; i < s.length() - k + 1; i++) {
            String subStr = s.substring(i, i + k);
            if (subStr.compareTo(smallest) < 0) {
                smallest = subStr;
            }
            if (subStr.compareTo(largest) > 0) {
                largest = subStr;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
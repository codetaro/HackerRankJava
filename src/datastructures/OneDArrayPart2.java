package datastructures;

import java.io.*;
import java.util.*;

public class OneDArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        return false;
    }

    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
        File file = new File("src/datastructures/OneDArrayPart2.in");
        Scanner scan = new Scanner(file);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}

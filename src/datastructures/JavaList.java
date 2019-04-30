package datastructures;

import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        java.util.List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        int m = scan.nextInt();
        for (int j = 0; j < m; j++) {
            String opt = scan.next();
            if (opt.equals("Insert")) {
                int k = scan.nextInt();
                int v = scan.nextInt();
                list.add(k, v);
            }
            if (opt.equals("Delete")) {
                int k = scan.nextInt();
                list.remove(k);
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}


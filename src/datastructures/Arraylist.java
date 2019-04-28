package datastructures;

import java.io.*;
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List iList = new ArrayList();
        for (int i = 0; i < n; i++) {
            String[] ints = scan.nextLine().split("\\s");
            iList.add(ints);
        }
        int m = Integer.parseInt(scan.nextLine());
        List qList = new ArrayList();
        for (int j = 0; j < m; j++) {
            String[] ques = scan.nextLine().split("\\s");
            int x = Integer.parseInt(ques[0]);
            int y = Integer.parseInt(ques[1]);
            qList.add(new Query(x, y));
        }
        for (Object q : qList) {
            Query query = (Query) q;
            query(iList, query);
        }
    }

    public static void query(List matrix, Query query) {
        int x = query.x - 1;
        int y = query.y;
        try {
            String[] arr = (String[]) matrix.get(x);
            System.out.println(arr[y]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("ERROR!");
        }
    }
}

class Query {
    public int x;
    public int y;

    public Query(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
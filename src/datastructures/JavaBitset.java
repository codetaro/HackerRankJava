package datastructures;

import java.io.*;
import java.util.*;

public class JavaBitset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        List<BitSet> setList = new ArrayList<>();
        setList.add(b1);
        setList.add(b2);
        String op;
        int op1, op2;
        for (int i = 0; i < m; i++) {
            op = scan.next();
            op1 = scan.nextInt();
            op2 = scan.nextInt();

            switch (op) {
                case "AND":
                    b1 = setList.get(op1 - 1);
                    b2 = setList.get(op2 - 1);
                    b1.and(b2);
                    break;
                case "OR":
                    b1 = setList.get(op1 - 1);
                    b2 = setList.get(op2 - 1);
                    b1.or(b2);
                    break;
                case "XOR":
                    b1 = setList.get(op1 - 1);
                    b2 = setList.get(op2 - 1);
                    b1.xor(b2);
                    break;
                case "FLIP":
                    b1 = setList.get(op1 - 1);
                    b1.flip(op2);
                    break;
                case "SET":
                    b1 = setList.get(op1 - 1);
                    b1.set(op2);
                    break;
                default:
                    throw new RuntimeException("Invalid operation");
            }
            System.out.println(setList.get(0).cardinality() + " " + setList.get(1).cardinality());
        }
    }
}


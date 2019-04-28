package bignumber;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.math.BigInteger bInt1 = new java.math.BigInteger(scan.next());
        java.math.BigInteger bInt2 = new java.math.BigInteger(scan.next());
        System.out.println(bInt1.add(bInt2));
        System.out.println(bInt1.multiply(bInt2));
    }
}

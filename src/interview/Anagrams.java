package interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int pairs = 0;

        Map<Integer, List<String>> m = new HashMap<>();
        for (int i = 1; i < s.length(); i++) {
            m.put(i, subStrLst(s, i));
        }

        return pairs;
    }

    static List<String> subStrLst(String s, int len) {
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < s.length() - len + 1; i++) {
            lst.add(s.substring(i, i + len));
        }
        return lst;
    }

    static int pairsOfAnagrams(Map<Integer, List<String>> map) {
        int pairs = 0;

        for (Integer key : map.keySet()) {
            for (String s : map.get(key)) {
                // TODO
            }
        }

        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile.txt"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

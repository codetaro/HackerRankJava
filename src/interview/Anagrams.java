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
    /*static int sherlockAndAnagrams(String s) {
        Map<Integer, List<String>> m = new HashMap<>();
        for (int i = 1; i < s.length(); i++) {
            m.put(i, subStrLst(s, i));
        }

        return pairsOfAnagrams(m);
    }*/
    static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Keep track of how many anagrams we've seen
        int totalCount = 0;

        // Generate all substrings (N^2)
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSubString = s.substring(i, j);

                // Sort all strings E.g. ab & ba both == ab now
                char[] chars = currentSubString.toCharArray();
                Arrays.sort(chars);
                currentSubString = String.valueOf(chars);

                // If sorted substring has been seen before
                if (map.containsKey(currentSubString)) {
                    // Check how many times we've seen it and add that amount to the count
                    int value = map.get(currentSubString);
                    totalCount = totalCount + value;

                    // Increment the times we've seen the string
                    map.put(currentSubString, value + 1);
                } else {
                    // Never seen it before = insert and set to 1 to indiciate we've now seen it
                    map.put(currentSubString, 1);
                }
            }
        }
        return totalCount;
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

        for (List<String> lst : map.values()) {
            for (int i = 0; i < lst.size() - 1; i++) {
                for (int j = i + 1; j < lst.size(); j++) {
                    List<Character> lst1 = toCharLst(lst.get(i));
                    List<Character> lst2 = toCharLst(lst.get(j));
                    if (lst1.equals(lst2)) pairs++;
                }
            }
        }

        return pairs;
    }

    static List<Character> toCharLst(String s) {
        List<Character> charLst = new ArrayList<>();
        for (char c : s.toCharArray()) {
            charLst.add(c);
        }
        charLst.sort(Character::compareTo);
        return charLst;
    }

    static Set<Character> toCharSet(String s) {
        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }
        return charSet;
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

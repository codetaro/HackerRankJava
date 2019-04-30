package datastructures;

import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> set = new HashSet<>();
        int max = 0;
        int remove = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            set.add(num);
            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                if (max == m) break;
                remove = deque.removeFirst();
                if (!deque.contains(remove)) set.remove(remove);
            }
        }
        System.out.println(max);
    }
}

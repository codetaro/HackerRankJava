package introduction;

import java.util.Scanner;

public class StaticInitializerBlock {

    private static int B;
    private static int H;
    private static Scanner scanner = new Scanner(System.in);
    private static boolean flag = true;

    static {
        B = scanner.nextInt();
        H = scanner.nextInt();
        try {
            if (B <= 0 || H <= 0) {
                throw new RuntimeException("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}

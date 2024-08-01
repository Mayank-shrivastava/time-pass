package PatternProblems;

import java.util.ArrayList;

public class P4 {
    public static void main(String[] args) {
        System.out.println("Pattern-1");
        pattern1(4);
        System.out.println("Pattern-2");
        pattern2(6);
        System.out.println("pattern-3");
        pattern3(5);
        System.out.println("Pattern-4");
        pattern4(5);

    }

    private static void pattern4(int n) {
        // first half
        for (int i = 0; i < (n / 2) + 1; i++) {
            // print spaces
            for (int j = 1; j <= (n - i - 1); j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second part

    }

    private static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            // print number
            for (int j = i + 1; j <= 2 * i + 1; j++) {
                System.out.print(j);
            }
            // print number
            for (int j = 2 * i; j >= i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        // i = 0 4444 n-i
        // i = 1 333 n-i
        // i = 2 22 n-i
        // i = 4 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(n - i);
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

}

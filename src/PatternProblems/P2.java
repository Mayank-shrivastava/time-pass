package PatternProblems;

public class P2 {
    public static void main(String[] args) {
        System.out.println("****Pattern-1******");
        pattern1(6);
        System.out.println("Pattern-2");
        pattern2(7);
        System.out.println("Pattern-3");
        pattern3(6);
        System.out.println("Pattern-4");
        pattern4(7);

    }

    private static void pattern4(int n) {
        int ch = 'A' + n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(ch - i+j));
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + i + j));
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + i));
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

}

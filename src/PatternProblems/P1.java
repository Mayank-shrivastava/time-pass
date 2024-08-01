package PatternProblems;

public class P1 {
    public static void main(String[] args) {
        System.out.println("Pattern-1");
        pattern1(4, 6);
        System.out.println("Pattern-2");
        pattern2(4, 4);

    }

    private static void pattern2(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j <= i) {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    private static void pattern1(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}

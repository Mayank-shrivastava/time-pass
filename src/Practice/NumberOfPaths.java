package Practice;

public class NumberOfPaths {
    public static void main(String[] args) {
        long mod = (long) (1e9 + 7);
        long ans = helper(0, 0, 2, 2);
        //System.out.println(ans);
        System.out.println(ans % mod);
    }

    static long helper(int cr, int cc, int dr, int dc) {
        // base condition
        // +ve base case
        if (cr == dr && cc == dc) return 1;

        // -ve base case
        if (cr > dr || cc > dc) return 0;

        return (helper(cr + 1, cc, dr, dc) + helper(cr, cc + 1, dr, dc));

    }
}

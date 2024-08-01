package Hashing;

import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();
            long[] prefixSum = new long[n];
            prefixSum[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            }
            int q = scn.nextInt();
            for (int i = 1; i <= q; i++) {
                int l = scn.nextInt();
                int r = scn.nextInt();
                if (l > 0) {
                    System.out.println(prefixSum[r] - prefixSum[l - 1]);
                } else {
                    System.out.println(prefixSum[r]);
                }

            }
            scn.close();
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
        }

    }
}

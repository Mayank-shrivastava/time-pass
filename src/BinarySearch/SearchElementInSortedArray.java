package BinarySearch;

import java.util.Scanner;

public class SearchElementInSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int target = scn.nextInt();

        // find index of target in the arr if not present return -1
        int index = binarySearch(arr, arr.length, 0, target);
        System.out.println(index);
        scn.close();
    }

    static int binarySearch(int[] arr, int hi, int lo, int target) {
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1;
    }
}

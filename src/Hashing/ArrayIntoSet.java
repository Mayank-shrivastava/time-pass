package Hashing;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayIntoSet {
    public static void main(String[] args) {
        
        int[] nums = {100,4,200,1,3,2};
        // Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        // Set<Integer> set2 = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        // System.out.println(set);
        // System.out.println(set2);
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int ans = 0;
        for (int num : nums) {

            if (!set.contains(num-1)) {
                int currNum = num;
                int currLen = 1;
                while(set.contains(currNum+1)) {
                    currNum++;
                    currLen++;
                }
                ans = Math.max(currLen, ans);
            }
        }
        System.out.println(ans);
    }
}

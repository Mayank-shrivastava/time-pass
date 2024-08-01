package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        Map<Character, Integer> freqMap1 = new HashMap<>();
        for (String word : words) {
            Map<Character, Integer> freqMap2 = new HashMap<>();
            for (char ch : word.toCharArray()) {
                freqMap2.put(ch, freqMap2.getOrDefault(ch, 0) + 1);
            }

            // update the value of freqMap1
            for (int i = 0; i < 26; i++) {
                char ch = (char)(97 + i);
                if (freqMap2.containsKey(ch) && freqMap1.containsKey(ch)) {
                    int val = 
                    Math.min(freqMap1.getOrDefault(ch, 0), freqMap2.getOrDefault(ch, 0));
                    freqMap1.put(ch, val);
                }
                else 
                {
                    freqMap1.put(ch, freqMap2.getOrDefault(ch, 0));
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            char ch = (char)(97 + i);
            int freqOfChar = freqMap1.getOrDefault(ch, 0);
            if (freqOfChar >= 1) {
                for (int j = 0; j < freqOfChar; j++) {
                    ans.add(String.valueOf(ch));
                }
            }
        }
        System.out.println(ans);
    }
}

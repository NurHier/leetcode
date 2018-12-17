package algorithm.string;

import java.util.*;

/**
 * 893. 特殊等价字符串组
 */
public class NumSpecialEquivGroups {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> oddEvenSet = new HashSet<>();
        for (String s : A) {
            List<Character> oddList = new ArrayList<>();
            List<Character> evenList = new ArrayList<>();
            int i = 0;
            while (i < s.length()) {
                if (i % 2 == 0) {
                    evenList.add(s.charAt(i));
                } else {
                    oddList.add(s.charAt(i));
                }
                i++;
            }
            Collections.sort(oddList);
            Collections.sort(evenList);
            oddEvenSet.add(Arrays.toString(oddList.toArray()) + Arrays.toString(evenList.toArray()));
        }
        return oddEvenSet.size();
    }

    public static void main(String[] args) {
        System.out.println(new NumSpecialEquivGroups().numSpecialEquivGroups(new String[]{"a","b","c","a","c","c"}));
    }
}

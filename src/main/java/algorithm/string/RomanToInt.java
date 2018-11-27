package algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] ss = s.toCharArray();
        int re = 0;
        for (int i = 0; i < s.length(); i++) {
            int t1 = map.get(ss[i]);
            if (i + 1 < s.length()) {
                int t2 = map.get(ss[i + 1]);
                if (t1 >= t2) {
                    re += t1;
                } else {
                    re -= t1;
                }
            } else {
                re += t1;
            }
        }
        return re;
    }
    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("VII"));
    }
}

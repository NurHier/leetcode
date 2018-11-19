package algorithm.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hao.zhou02
 * @date 2018/11/16
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (characterMap.get(chars[i]) != null) {
                characterMap.put(chars[i], characterMap.get(chars[i]) + 1);
            } else {
                characterMap.put(chars[i], 1);
            }
        }
        for (int i = 0; i < chart.length; i++) {
            if (characterMap.get(chart[i]) != null) {
                characterMap.put(chart[i], characterMap.get(chart[i]) - 1);
            } else {
                characterMap.put(chart[i], 1);
            }
        }
        char re = '0';
        for (Character c : characterMap.keySet()) {
            if (characterMap.get(c) != 0) {
                re = c;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(new FindTheDifference().findTheDifference("abcd", "acbde"));
    }
}

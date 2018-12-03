package algorithm.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
 * <p>
 * 这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        char[] chars = pattern.toCharArray();
        String[] strs = str.split(" ");
        if (chars.length != strs.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>(chars.length);
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            String value = map.get(chars[i]);
            strSet.add(strs[i]);
            if (value != null) {
                if (!value.equals(strs[i])) {
                    return false;
                }
            } else {
                map.put(chars[i], strs[i]);
            }
        }
        return  (map.size() == strSet.size());
    }

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));
    }
}

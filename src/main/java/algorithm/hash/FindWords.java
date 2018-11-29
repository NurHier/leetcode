package algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American
 * keyboard like the image below.
 */
public class FindWords {
    public String[] findWords(String[] words) {
        String[] keyboardWord = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> wordMap = new HashMap<>(26);
        int k = 0;
        for (String keyWord : keyboardWord) {
            char[] chars = keyWord.toCharArray();
            for (char c : chars) {
                wordMap.put(c, k);
            }
            k++;
        }
        List<String> reList = new ArrayList<>();
        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            int a = wordMap.get(chars[0]);
            int i = 1;
            for (; i < chars.length; i++) {
                if (wordMap.get(chars[i]) != a) {
                    break;
                }
            }
            if (i == chars.length) {
                reList.add(word);
            }
        }
        return reList.toArray(new String[reList.size()]);
    }

    public static void main(String[] args) {
        System.out.println(new FindWords().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }
}

package algorithm.string;

import java.util.HashSet;
import java.util.Set;

public class ToGoatLatin {
    public String toGoatLatin(String S) {
        if (S == null || S.isEmpty()) {
            return "";
        }
        init();
        String[] words = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0))) {
                sb.append(word).append(getSuffixA(i + 1));
            } else {
                sb.append(word.substring(1, word.length())).append(word.charAt(0)).append(getSuffixA(i + 1));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String getSuffixA(int index) {
        String suffix = "ma";
        StringBuilder sb = new StringBuilder();
        sb.append(suffix);
        for (int i = 0; i < index; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    Set<Character> set = new HashSet<>();

    private void init() {
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
    }

    private boolean isVowel(char c) {
        return set.contains(c);
    }

    public static void main(String[] args) {
        System.out.println(new ToGoatLatin().toGoatLatin(""));
    }
}

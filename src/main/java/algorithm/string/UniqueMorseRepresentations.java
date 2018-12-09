package algorithm.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] pwd = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> translateWord = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(pwd[word.charAt(i) - 'a']);
            }
            translateWord.add(sb.toString());
        }
        return translateWord.size();
    }

    public static void main(String[] args) {
        System.out.println(new UniqueMorseRepresentations().uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}

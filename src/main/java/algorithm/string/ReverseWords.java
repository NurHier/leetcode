package algorithm.string;

/**
 * 反转字符串中的单词 III
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] splits = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String split : splits) {
            sb.append(reverse(split)).append(" ");
        }
        return sb.toString().trim();
    }

    private String reverse(String s) {
        char[] sChar = s.toCharArray();
        int l = 0;
        int h = s.length() - 1;
        while (l < h) {
            char tmp = sChar[l];
            sChar[l] = sChar[h];
            sChar[h] = tmp;
            l++;
            h--;
        }
        return new String(sChar);
    }


    public static void main(String[] args) {
        System.out.println(new ReverseWords().reverseWords("a"));
    }
}

package algorithm.string;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] ss = s.split(" ");
        if (ss.length < 1) {
            return 0;
        }
        return ss[ss.length -1].length();
    }
    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord(" "));
    }
}

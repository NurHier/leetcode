package algorithm.string;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] box = new int[26];
        char[] ransomChar = ransomNote.toCharArray();
        char[] magazineChar = magazine.toCharArray();
        for (char c : ransomChar) {
            int index = c - 'a';
            box[index] = box[index] + 1;
        }
        for (char c : magazineChar) {
            int index = c - 'a';
            box[index] = box[index] - 1;
        }
        for (char c : ransomChar) {
            int index = c - 'a';
            if (box[index] > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CanConstruct().canConstruct("aa", "ab"));
    }
}

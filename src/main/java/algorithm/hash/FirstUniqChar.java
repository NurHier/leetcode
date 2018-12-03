package algorithm.hash;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] buckets = new int[26];
        for (char c : chars) {
            int index = c - 'a';
            int temp = buckets[index];
            if (temp != 0) {
                buckets[index] = temp + 1;
            } else {
                buckets[index] = 1;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (buckets[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar(""));
    }
}

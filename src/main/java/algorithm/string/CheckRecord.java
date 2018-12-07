package algorithm.string;

/**
 * 学生出勤纪录 I
 */
public class CheckRecord {
    public boolean checkRecord(String s) {
        int len = s.length();
        int absent = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'A') {
                absent += 1;
                if (absent > 1) {
                    return false;
                }
            } else if (i < len - 2 && s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CheckRecord().checkRecord("ALLPLL"));
    }
}

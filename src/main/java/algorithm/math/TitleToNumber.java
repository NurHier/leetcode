package algorithm.math;

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 */
public class TitleToNumber {
    public int titleToNumber(String s) {
        char[] schar = s.toCharArray();
        int len = schar.length;
        int num = 0;
        for (int i = 0; i < len; i++) {
            num += (schar[i] - 64) * (Math.pow(26, len - i - 1));
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new TitleToNumber().titleToNumber("ZY"));
    }
}

package algorithm;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int t = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                t++;
            }
            n= n>>> 1;
        }
        return t;
    }
    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(1, 5));
    }
}

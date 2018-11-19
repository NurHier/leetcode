package algorithm.bit;

/**
 * 颠倒给定的 32 位无符号整数的二进制位。
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int t = 0;
        for (int i = 0; i < 32; i++) {
            int m = n & 1;
            n = (n >>> 1);
            t = (m << (31-i)) | t;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverseBits(1));
    }
}

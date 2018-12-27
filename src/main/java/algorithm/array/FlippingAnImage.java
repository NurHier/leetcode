package algorithm.array;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        for (int i = 0; i < row; i++) {
            this.revert(A[i]);
            for (int j = 0; j < column; j++) {
                A[i][j] ^= 1;
            }
        }
        return A;
    }

    private void revert(int[] B) {
        int l = 0;
        int h = B.length - 1;
        while (l < h) {
            int a = B[l] + B[h];
            B[l] = a - B[l];
            B[h] = a - B[l];
            l++;
            h--;
        }
    }

    public static void main(String[] args) {
        new FlippingAnImage().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
    }
}

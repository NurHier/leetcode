package algorithm.array;

/**
 * 556  reshape-the-matrix
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] newMatrix = new int[r][c];
        int o_c = nums[0].length;
        for (int i = 0; i < r * c; i++) {
            newMatrix[i / c][i % c] = nums[i / o_c][i % o_c];
        }
        return newMatrix;
    }

    public int[][] matrixReshape2(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] newMatrix = new int[r][c];
        int[] temp = new int[r * c];
        int o_r = nums.length;
        int o_c = nums[0].length;
        for (int i = 0; i < o_r; i++) {
            for (int j = 0; j < o_c; j++) {
                temp[i * o_c + j] = nums[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newMatrix[i][j] = temp[i * c + j];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        new MatrixReshape().matrixReshape2(new int[][]{{1, 2}, {3, 4}}, 1, 4);
    }
}

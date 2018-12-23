package algorithm.array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != 0) {
                j++;
            } else {
                while (nums[j] == 0 && j < nums.length - 1) {
                    if (j < nums.length - 1) {
                        j++;
                    }
                }
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
        for (int c : nums) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0, 0});
    }
}

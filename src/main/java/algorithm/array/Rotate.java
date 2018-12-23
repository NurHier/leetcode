package algorithm.array;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int count = k % nums.length;
        while (count > 0) {
            this.rotateOnce(nums);
            k--;
        }
        for (int n : nums) {
            System.out.println(n);
        }
    }

    private void rotateOnce(int[] nums) {
        int last = nums.length - 1;
        for (int i = 0; i < last; i++) {
            int temp = nums[last];
            nums[last] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        new Rotate().rotate(new int[]{},  4);
    }
}

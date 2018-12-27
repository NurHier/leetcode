package algorithm.array;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int a = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int b = nums[0] * nums[1] * nums[2];
        int c = nums[0] * nums[1] * nums[len - 1];
        int max = a >= b ? a : b;
        return max > c? max:c;
    }
    public static void main(String[] args) {
        System.out.println(new MaximumProductOfThreeNumbers().maximumProduct(new int[]{-1, -2, -3, 4}));
    }
}

package algorithm.array;

import java.util.Arrays;

/**
 * 561. 数组拆分 I
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}

package algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 16. 最接近的三数之和
 * nums = [-1, 0, 1, 2, -1, -4]
 * <p>
 * Arrays.sort(nums) = [ -4, -1, -1, 0, 1, 2]
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    result = sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}

package algorithm.array;

/**
 * 167 两数之和 II - 输入有序数组
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int height = numbers.length - 1;
        while (low < height) {
            int sum = numbers[low] + numbers[height];
            if (sum == target) {
                return new int[]{low + 1, height + 1};
            } else if (sum > target) {
                height--;
            } else {
                low++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new TwoSum().twoSum(new int[]{5, 25, 75}, 100);
    }
}

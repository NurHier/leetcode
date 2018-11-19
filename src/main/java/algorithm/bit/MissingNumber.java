package algorithm.bit;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sumAll = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            if (i < nums.length) {
                sum += nums[i];
            }
            sumAll += i;
        }
        return sumAll - sum;
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{0, 2, 3}));
    }
}

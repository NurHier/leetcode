package algorithm.array;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        if (nums.length < 3) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (current >= f) {
                if (current != f) {
                    t = s;
                    s = f;
                    f = current;
                }
            } else if (current >= s) {
                if (current != s) {
                    t = s;
                    s = current;
                }
            } else if (current >= t) {
                t = current;
            } else {
                continue;
            }
        }
        if (t == Long.MIN_VALUE) {
            return (int) f;
        }
        return (int) t;
    }

    public static void main(String[] args) {
        System.out.println(new ThirdMax().thirdMax(new int[]{2, 3}));
    }
}

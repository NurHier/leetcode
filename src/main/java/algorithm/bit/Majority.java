package algorithm.bit;

/**
 * 摩尔投票
 */
public class Majority {
    public int majorityElement(int[] nums) {

        int maj = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (maj == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    maj = nums[i];
                    count = 1;
                }
            }
        }
        return maj;
    }

    public static void main(String[] args) {
        System.out.println(new Majority().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}

package algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> bucket = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer key = nums[i];
            if (bucket.containsKey(key)) {
                bucket.put(key, bucket.get(key) + 1);
            } else {
                bucket.put(key, 1);
            }
        }
        int c = 0;
        for (Integer key : bucket.keySet()) {
            if (bucket.get(key) == 0) {
                continue;
            }
            if (k > 0) {
                if (bucket.get(key + k) != null) {
                    c++;
                    System.out.println(key + ":" + (key + k));
                }
            } else if (k == 0) {
                if (bucket.get(key) > 1) {
                    c++;
                    System.out.println(key + ":" + key);
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new FindPairs().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }
}

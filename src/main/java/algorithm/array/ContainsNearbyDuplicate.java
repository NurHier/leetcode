package algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (numMap.containsKey(n)){
                if (Math.abs(i - numMap.get(n)) <= k) {
                    return true;
                } else {
                    numMap.put(n, i);
                }
            } else {
                numMap.put(n, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
}

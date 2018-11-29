package algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        int maxFrequent = 1;
        Map<Integer, Integer> fMap = new HashMap<>();
        for (int num : nums) {
            Integer value = fMap.get(num);
            if (value != null) {
                int currentValue = value + 1;
                fMap.put(num, currentValue);
                if (currentValue > maxFrequent) {
                    maxFrequent = currentValue;
                }
            } else {
                fMap.put(num, 1);
            }
        }
        List<Integer>[] buckets = new List[maxFrequent + 1];
        for (int key : fMap.keySet()) {
            int value = fMap.get(key);
            if (buckets[value] != null) {
                buckets[value].add(key);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(key);
                buckets[value] = temp;
            }
        }
        List<Integer> re = new ArrayList<>(k);
        for (int i = maxFrequent; i > 0 && re.size() < k; i--) {
            if (buckets[i] != null) {
                re.addAll(buckets[i]);
            }
        }
        return re;
    }

    public static void main(String[] args) {
        new TopKFrequent().topKFrequent(new int[]{1,1,1,2,2,2,3}, 1);
    }
}

package algorithm.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.get(nums1[i]) != null) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null && map.get(nums2[i]) != 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] re = new int[result.size()];
        int i = 0;
        for (Integer value : result) {
            re[i] = value;
            i++;
        }
        return re;

    }

    public static void main(String[] arg) {
        int[] a = {4, 9, 9};
        int[] b = {9, 4, 9, 8, 4};
        System.out.println(new Intersection2().intersection(a, b).length);
    }
}

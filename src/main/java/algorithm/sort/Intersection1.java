package algorithm.sort;

import java.util.*;

public class Intersection1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 0);
        }
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null && map.get(nums2[i]) == 0) {
                map.put(nums2[i], 1);
                count++;
            }
        }
        int[] re = new int[count];
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                re[--count] = key;
            }
        }
        return re;

    }

    public static void main(String[] arg) {
        int[] a = {1, 2,2,1};
        int[] b = {2, 2};
        System.out.println(new Intersection1().intersection(a, b).length);
    }
}

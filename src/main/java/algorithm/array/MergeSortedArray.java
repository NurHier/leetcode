package algorithm.array;

/**
 * 88.  合并两个有序数组
 */
public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] < nums2[index2]) {
                nums1[index] = nums2[index2];
                index2--;
            } else {
                nums1[index] = nums1[index1];
                index1--;
            }
            index--;
        }
        if (index2 >= 0) {
            for (int i = index2; i >= 0; i--) {
                nums1[index] = nums2[i];
                index--;
            }
        }
        return nums1;
    }
    public static void main(String[] args) {
        new MergeSortedArray().merge(new int[]{0}, 0, new int[]{2}, 1);
    }
}

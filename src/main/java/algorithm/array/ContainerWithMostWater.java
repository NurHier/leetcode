package algorithm.array;

/**
 * 11. 盛最多水的容器
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;
        while (low < high) {
            int countArea = (high - low) * Math.min(height[low], height[high]);
            if (countArea > maxArea) {
                maxArea = countArea;
            }
            if (height[low] > height[high]) {
                high--;
            } else {
                low++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(height));
    }
}

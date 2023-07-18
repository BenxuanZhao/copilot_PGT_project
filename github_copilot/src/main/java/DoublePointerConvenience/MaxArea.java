package DoublePointerConvenience;

public class MaxArea {
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (right > left) {
            int c = (Math.min(height[right], height[left])) * (right - left);
            if (c >= result) {
                result = c;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

}

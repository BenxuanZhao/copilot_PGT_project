package DoublePointerConvenience;

public class Rain {
    /* Here is the explanation for the code above:
1. For each element in the array, we find the maximum level of water it can trap after the rain,
   which is equal to the minimum of maximum height of bars on both the sides minus its own height.
2. We then sum up the values obtained for all the elements in the array. */
    public int trap(int[] height) {
        int ans = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int maxLeft = 0, maxRight = 0;
            for (int j = i; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < size; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            ans += Math.min(maxLeft, maxRight) - height[i];
        }
        return ans;
    }
}

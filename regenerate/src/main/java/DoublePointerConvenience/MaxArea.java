package DoublePointerConvenience;

public class MaxArea {
    /* Here is the explanation for the code above:
1. We take two pointers, one at the beginning and one at the end of the array constituting the length of the lines.
2. Futher, we maintain a variable maxareamaxarea to store the maximum area obtained till now. At every step, we find out the area formed between them, update maxareamaxarea and move the pointer pointing to the shorter line towards the other end by one step.
3. Initially, we consider the area constituting the exterior most lines. Now, to maximize the area, we need to consider the area between the lines of larger lengths. If we try to move the pointer at the longer line inwards, we won't gain any increase in area, since it is limited by the shorter line.
4. But moving the shorter line's pointer could turn out to be beneficial, as per the same argument, despite the reduction in the width. This is done since a relatively longer line obtained by moving the shorter line's pointer might overcome the reduction in area caused by the width reduction. */
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;

        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l)); // Math.min(height[l], height[r]) * (r - l) is the area of the rectangle
            if (height[l] < height[r]) { // if height[l] < height[r], then the area of the rectangle is limited by height[l], so we move l to the right
                l++;
            } else { // if height[l] >= height[r], then the area of the rectangle is limited by height[r], so we move r to the left
                r--;
            }
        }

        return maxarea;
    }
}

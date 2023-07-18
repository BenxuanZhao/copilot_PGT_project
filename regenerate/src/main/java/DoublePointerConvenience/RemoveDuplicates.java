package DoublePointerConvenience;

public class RemoveDuplicates {
    /* Here is the explanation for the code above:
1. Use a variable (c) to keep track of the current position.
2. Loop through the array from 1 to the end.
3. If the current value is not equal to the value at c, increment c and set the value at c to the current value.
4. Return c + 1. */
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int c = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[c]) {
                c++;
                nums[c] = nums[i];
            }
        }
        return c + 1;
    }
}

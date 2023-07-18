package DoublePointerConvenience;

public class MinSubArray {
    /* Here is the explanation for the code above:
1. use two pointers, i and k, to mark the start and end of the subarray
2. use a variable sum to record the sum of the subarray between i and k
3. if sum is smaller than s, then we need to add another element to the subarray, so we move k one step forward and add the value of nums[k] to sum
4. if sum is larger than s, then we need to remove one element from the subarray, so we move i one step forward and subtract the value of nums[i] from sum
5. after each step, we need to update the value of min, which records the minimum length of the subarray whose sum is larger than or equal to s
6. the loop will terminate when k reaches the end of the array and i reaches the end of the array
7. we need to return 0 if min is still Integer.MAX_VALUE after the loop, which means there is no subarray whose sum is larger than or equal to s */
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int i = 0;
        int k = 0;
        int min = Integer.MAX_VALUE;
        while (true) {
            if (k == nums.length && i == nums.length) {
                break;
            }
            if (sum < s) {
                if (k == nums.length) {
                    break;
                }
                sum += nums[k];
                k++;
            } else {
                min = Math.min(k - i, min);
                sum -= nums[i];
                i++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}

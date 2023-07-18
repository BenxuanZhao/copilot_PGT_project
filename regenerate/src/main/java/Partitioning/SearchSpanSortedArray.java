package Partitioning;

public class SearchSpanSortedArray {/* Here is the explanation for the code above:
1. Find middle point mid = (l + h)/2
2. If key is present at middle point, return mid.
3. Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l]
       to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..h]
4. Else (arr[mid+1..h] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]
       to arr[h], recur for arr[mid+1..h].
    b) Else recur for arr[l..mid] */
//    public int search(int[] nums, int target) {
//        return search(nums, 0, nums.length - 1, target);
//    }
}

package Heap;

import java.util.PriorityQueue;

public class FindKthLargest {
    /* Here is the explanation for the code above:
1. First, we insert all the elements into a heap. The size of the heap is always maintained at k.
2. If the size of the heap is greater than k, then we remove the top element from the heap.
This is because, we are interested in the kth largest element and hence if it is present in the heap,
it has to be among the top k elements in the heap.
3. Finally, the top element in the heap is the kth largest element. */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap =
                new PriorityQueue<>((n1, n2) -> n1 - n2);

        for (int n: nums) {
            heap.add(n);
            if (heap.size() > k){
                heap.poll();
            }
        }

        return heap.poll();
    }
}

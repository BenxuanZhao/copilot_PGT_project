//package Partitioning;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class SearchSpanSortedArrayTest {
//    @Test
//    public void testSearch() {
//        SearchSpanSortedArray searchArray = new SearchSpanSortedArray();
//
//        int[] nums = {4, 5, 6, 7, 0, 1, 2};
//        int target = 0;
//        int expected = 4;
//
//        long startTime = System.nanoTime();
//        int result = searchArray.search(nums, target);
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//
//        Assertions.assertEquals(expected, result);
//        System.out.println("Result: " + result);
//        System.out.println("Execution time: " + duration + " nanoseconds");
//    }
//}
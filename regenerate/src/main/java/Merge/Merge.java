package Merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    /* Here is the explanation for the code above:
1. Sort the intervals based on their start time
2. Add the first interval to the output array
3. Iterate through the sorted array and check if the end time of the last interval is greater than the start time of the new interval
4. If not, we add the new interval to the output array and update the last interval
5. If yes, then we update the end time of the last interval to be the max of the end time of the last interval and the end time of the new interval
6. Return the output array */
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));

        int[] currInterval = intervals[0];
        List<int[]> resArr = new ArrayList<>();
        resArr.add(currInterval);

        for(int[] interval: intervals){
            int currEnd = currInterval[1];

            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currEnd >= nextBegin){
                currInterval[1] = Math.max(currEnd, nextEnd);
            } else{
                currInterval = interval;
                resArr.add(currInterval);
            }
        }

        return resArr.toArray(new int[resArr.size()][]);
    }
}

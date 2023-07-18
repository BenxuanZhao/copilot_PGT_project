package DynamicPlanning;

import java.util.ArrayList;
import java.util.List;

public class YHTriangle {
    /* Here is the explanation for the code above:
1. The first row is always [1]. Initialize a list, and add that to the triangle list.
2. The second row is always [1,1]. We can hard code this. Add that to the triangle list.
3. Now, we have to generate the third row.
The third row is [1,2,1]. The second row is [1,1].
We can generate the third row by adding the second row shifted left, to itself shifted right.
Specifically, [1,2,1] = [0+1,1+1,1+0]. We prepend and append a 0.
4. Now, we have to generate the fourth row.
Add a 0 in the beginning and at the end of the third row. [1,2,1] -> [0,1,2,1,0].
Add that to the triangle list.
5. Continue this process until you have generated the required number of rows. */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);
            row.add(1);

            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}

package ArrayOperation;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    /* Here is the explanation for the code above:
1. Use a boolean[][] to mark the visited cells.
2. Use a direction variable to indicate the direction we are going to move.
3. If we are able to move to the next cell, move to the next cell.
4. If we cannot move to the next cell, change the direction and move to the next cell.
5. If we cannot move to the next cell and we have already visited the next cell, we know we have reached the end of the matrix. */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rs = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return rs;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];

        int i = 0;
        int j = 0;
        int direction = 1;
        while (true) {
            if (i < 0 || j < 0 || i == m || j == n || visited[i][j]) {
                break;
            }
            rs.add(matrix[i][j]);
            visited[i][j] = true;
            switch (direction) {
                case 1:
                    if (j + 1 == n || visited[i][j + 1]) {
                        i++;
                        direction = 2;
                    } else {
                        j++;
                    }
                    break;
                case 2:
                    if (i + 1 == m || visited[i + 1][j]) {
                        j--;
                        direction = 3;
                    } else {
                        i++;
                    }
                    break;
                case 3:
                    if (j == 0 || visited[i][j - 1]) {
                        i--;
                        direction = 4;
                    } else {
                        j--;
                    }
                    break;
                case 4:
                    if (visited[i - 1][j]) {
                        j++;
                        direction = 1;
                    } else {
                        i--;
                    }
                    break;
                default:
                    break;
            }
        }
        return rs;
    }

}

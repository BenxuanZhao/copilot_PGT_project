package ArrayOperation;

public class SetZeroMatrix {
    /* Here is the explanation for the code above:
1. scan the first row and column, if there is a 0, set two flags row and col. Note that, we need two flags to separate row = 0 and col = 0 cases.
2. use first row and col to set matrix. Except the first row and col.
3. set first row and col by using two flags. */
    public void setZeroes(int[][] matrix) {
        boolean row = false;
        boolean column = false;
        for (int i = 0; i < matrix.length; i++) { // i < matrix.length
            for (int j = 0; j < matrix[i].length; j++) { // j < matrix[i].length
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        row = true;
                    }
                    if (j == 0) {
                        column = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) { // i < matrix.length
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[i].length; j++) { // j < matrix[i].length
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) { // j < matrix[0].length
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) { // i < matrix.length
                    matrix[i][j] = 0;
                }
            }
        }
        if (row) {
            for (int j = 1; j < matrix[0].length; j++) { // j < matrix[0].length
                matrix[0][j] = 0;
            }
        }
        if (column) {
            for (int i = 1; i < matrix.length; i++) { // i < matrix.length
                matrix[i][0] = 0;
            }
        }
    }
}

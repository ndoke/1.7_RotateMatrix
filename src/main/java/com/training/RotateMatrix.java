package com.training;

/**
 * {@link RotateMatrix} has a method to rotate a given matrix.
 * {@link RotateMatrix#rotateMatrix(int[][])} returns true if
 * it can successfully rotate a matrix.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class RotateMatrix {
    /**
     * Tries to rotate a matrix and returns true if it is
     * possible, else false.
     *
     * @param matrix matrix to ne rotated
     * @return true if the matrix is rotated
     */
    public boolean rotateMatrix(int matrix[][]) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;
        for(int layer = 0; layer < n / 2; layer++) {
            int firstLayer = layer;
            int lastLayer = n - 1 - layer;
            for (int currentlayer = firstLayer; currentlayer < lastLayer; currentlayer++) {
                int offset = currentlayer - firstLayer;

                // save top
                int top = matrix[firstLayer][currentlayer];

                // left --> top
                matrix[firstLayer][currentlayer] = matrix[lastLayer - offset][firstLayer];

                // bottom --> left
                matrix[lastLayer - offset][firstLayer] = matrix[lastLayer][lastLayer - offset];

                // right --> bottom
                matrix[lastLayer][lastLayer - offset] = matrix[currentlayer][lastLayer];

                // top --> right
                matrix[currentlayer][lastLayer] = top;
            }
        }

        return true;
    }
}

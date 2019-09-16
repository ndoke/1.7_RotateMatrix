package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RotateMatrixTest {
    RotateMatrix rotateMatrix = new RotateMatrix();
    private int matrix1[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    private int matrix2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    private int matrix3[][] = null;

    @Test
    public void test() {
        Assert.assertTrue(rotateMatrix.rotateMatrix(matrix1));

        Assert.assertEquals(matrix1[0], new int[]{13, 9, 5, 1});
        Assert.assertEquals(matrix1[1], new int[]{14, 10, 6, 2});
        Assert.assertEquals(matrix1[2], new int[]{15, 11, 7, 3});
        Assert.assertEquals(matrix1[3], new int[]{16, 12, 8, 4});

        Assert.assertFalse(rotateMatrix.rotateMatrix(matrix2));
        Assert.assertFalse(rotateMatrix.rotateMatrix(matrix3));
    }
}

package bsuir.webtech.firstlab.task6.MatrixCreator;

public class MatrixCreator {

    public int[][] buildMatrix(int[] array) {
        int matrixSize = array.length;
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i + j < matrixSize) {
                    matrix[i][j] = array[i + j];
                } else {
                    matrix[i][j] = array[(i + j) - matrixSize];
                }
            }
        }

        return matrix;
    }
}

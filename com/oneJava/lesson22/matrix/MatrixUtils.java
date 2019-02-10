package com.oneJava.lesson22.matrix;

/**
 * @author SerezaDorohin;
 * @version 1.0;
 * @type homework;
 */

// Задача: Реализовать метод, умножающий две 2-мерные матрицы (не обязательно квадратные).

public class MatrixUtils {
    public static void main(String[] args) {
        new MatrixUtils().run();
    }

    private void run() {
        int[][] matrix1fill = new int[3][2];
        int[][] matrix2fill = new int[2][4];

        matrix1fill[0][0] = 1;
        matrix1fill[0][1] = 2;
        matrix1fill[1][0] = 7;
        matrix1fill[1][1] = 8;
        matrix1fill[2][0] = 3;
        matrix1fill[2][1] = 4;

        matrix2fill[0][0] = 3;
        matrix2fill[0][1] = 4;
        matrix2fill[0][2] = 5;
        matrix2fill[0][3] = 6;
        matrix2fill[1][0] = 9;
        matrix2fill[1][1] = 0;
        matrix2fill[1][2] = 1;
        matrix2fill[1][3] = 2;

        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();

        matrix1.setMatrix(matrix1fill);
        matrix2.setMatrix(matrix2fill);

        int[][] result = run(matrix1, matrix2);
        String decryptedArray = decryptor(result);
        System.out.println(decryptedArray);
    }

    private int[][] run(Matrix matrix1, Matrix matrix2) {
        if(matrix1.getMatrix() == null || matrix2.getMatrix() == null) {
            throw new IllegalArgumentException();
        }
        if(matrix1.getHeight() != matrix2.getWidth()) {
            throw new IllegalArgumentException();
        }
        int[][] result = new int[matrix1.getWidth()][matrix2.getHeight()];
        for ( int i = 0; i < result.length; i++ ) {
            for ( int j = 0; j < result[0].length; j++ ) {
                int sum = 0;
                for ( int k = 0; k < matrix1.getHeight(); k++ ) {
                    sum += matrix1.getMatrix()[i][k] * matrix2.getMatrix()[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    private String decryptor(int[][] encryptedArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int n = 0; n < encryptedArray.length; n++) {
            for (int i = 0; i < encryptedArray[0].length; i++) {
                stringBuilder.append(encryptedArray[n][i] + " ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

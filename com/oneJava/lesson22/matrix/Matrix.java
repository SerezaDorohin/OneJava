package com.oneJava.lesson22.matrix;

public class Matrix {

    int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getHeight() {
        return matrix[0].length;
    }

    public int getWidth() {
        return matrix.length;
    }

}

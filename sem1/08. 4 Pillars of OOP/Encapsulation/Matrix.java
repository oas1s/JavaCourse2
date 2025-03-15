package Encapsulation;

import java.util.Arrays;

public class Matrix {
    private int[][] arr;

    public Matrix(int[][] array){
        this.arr = array;
    }

    public void printMatrix(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public int getElement(int i, int j){
        if (i > arr.length-1) {
            throw new RuntimeException("nanana i is higher than length");
        }
        return arr[i][j];
    }

    public void setElement(int i, int j, int value){
        arr[i][j] = value;
    }
}

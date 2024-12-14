import java.util.Arrays;

public class Matrix {
    private int[][] arr;

    public Matrix(int[][] array){
        arr = array;
    }

    public static Matrix sum(Matrix m1, Matrix m2){
        return null;
    }

    public void printMatrix(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

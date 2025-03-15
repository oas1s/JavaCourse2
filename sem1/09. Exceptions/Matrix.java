import java.util.Arrays;

public class Matrix {
    private int[][] array;

    public Matrix(int[][] array){
        this.array = array;
    }

    public void setElement(int row, int column, int value){
        array[row][column] = value;
    }

    public int getElement(int row, int column) throws Exception {
        if (row> array.length-1) {
            throw new MyException("row is high");
        }
        return array[row][column];
    }

    public void printMatrix(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

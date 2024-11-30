import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task24 {
    public static void main(String[] args) {
        int min = 0;
        int max = 9;
        int[][] matrix = new int[2][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom
                        .current()
                        .nextInt(min, max + 1);
            }
        }
        printMatrix(matrix);
    }


    public static void printMatrix(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            System.out.println(Arrays.toString(matr[i]));
        }
    }
}

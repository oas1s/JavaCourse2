import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
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

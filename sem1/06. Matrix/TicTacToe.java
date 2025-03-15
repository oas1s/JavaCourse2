import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chars = new char[3][3];
        boolean isXTurn = true;
        printMatrix(chars);
        while (isGameEnded(chars,isXTurn) == null){
            System.out.println("Insert row");
            int row = scanner.nextInt();
            System.out.println("Insert column");
            int column = scanner.nextInt();
            chars[row][column] = isXTurn ? 'X' : 'O';
            isXTurn = !isXTurn;
            printMatrix(chars);
        }
    }

    public static void printMatrix(char[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            System.out.println(Arrays.toString(matr[i]));
        }
    }

    public static Character isGameEnded(char[][] matr,boolean isXTurn) {
        boolean isEnded = false;
        for (int i = 1; i < matr.length; i++) {
            if (matr[i][i] != matr[i-1][i-1] || matr[i][i] == '\u0000'){
                isEnded = false;
                break;
            } else {
                isEnded = true;
            }
        }
        char winner = isXTurn? 'X' : 'O';
        return isEnded ? winner : null ;
    }
}

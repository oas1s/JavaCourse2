import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double x2 = x*x;
        double x3 = x2*x;
        double x4 = x2*x2;
        System.out.println(2*x4 - 3*x3 + 4* x2 - 5*x + 6);
    }
}

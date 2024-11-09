import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double x2 = x*x;
        double x4 = x2*x2;
        double x7 = x4*x2*x;
        System.out.println(x7);
    }
}

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println((Math.abs(x)-Math.abs(y))/(1-Math.abs(x*y)));
    }
}

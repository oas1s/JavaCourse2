import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), y = scanner.nextDouble();
        double buff = 0;
        if (x>y) {
            buff = x;
            x = 2*x*y;
            y = (buff+y)/2;
        } else {
            buff = x;
            x = (x+y)/2;
            y = 2*buff*y;
        }
        System.out.println(x + " " + y);
    }
}

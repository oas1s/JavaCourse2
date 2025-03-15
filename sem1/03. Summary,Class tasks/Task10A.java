import java.util.Scanner;

public class Task10A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a<0){
            System.out.println(-a);
        } else {
            System.out.println(-a*a);
        }
    }
}

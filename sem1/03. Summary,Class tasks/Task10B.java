import java.util.Scanner;

public class Task10B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a< -1){
            System.out.println(-1/(a*a));
        } else if (a>=-1 && a<2) {
            System.out.println(a*a);
        } else {
            System.out.println(4);
        }
    }
}

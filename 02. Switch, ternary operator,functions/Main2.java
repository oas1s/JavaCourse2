import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println("It is one");
                break;
            case 2:
                System.out.println("It is two");
                break;
            default:
                System.out.println("I dont process this number");
        }
    }
}

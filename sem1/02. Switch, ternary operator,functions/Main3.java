import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String str = a >=10 ? "Big number" : "Little number";
        System.out.println(str);
    }
}

import java.util.Scanner;

public class Task13a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = n*n;
        boolean flag = false;
        while (n2>0){
            int mod = n2%10;
            n2 = n2/10;
            if (mod == 3){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}

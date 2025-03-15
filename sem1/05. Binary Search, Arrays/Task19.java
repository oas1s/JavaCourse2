import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int findNumber = scanner.nextInt();
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean containsFlag = false;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == findNumber){
                containsFlag = true;
                break;
            }
        }
        System.out.println(containsFlag);

    }
}

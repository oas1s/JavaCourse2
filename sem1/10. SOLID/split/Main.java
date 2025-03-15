package split;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("test.txt"));
        String s = scanner.nextLine();
        String[] arr = s.split(",");
        System.out.println(Arrays.toString(arr));
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("test.txt"));
            String s = scanner.nextLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Util {

    private String path;

    public Util(String path){
        this.path = path;
    }

    public String getData() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        String s = "";
        while (scanner.hasNextLine()){
            s += scanner.nextLine();
        }
        return s;
    }
}

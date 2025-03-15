import java.io.FileNotFoundException;

public class Main2 {
    public static void main(String[] args) {
        Util util = new Util("test1.txt");
        try {
            String s = util.getData();
            System.out.println(s);
        } catch (Exception e){
            System.err.println("file not found");
        }
    }
}

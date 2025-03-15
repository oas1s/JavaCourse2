package file_writer;

import java.io.FileWriter;

public class WriteFileMain {
    public static void main(String[] args) throws Exception{
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("Hello from app");
        fileWriter.close();
    }
}

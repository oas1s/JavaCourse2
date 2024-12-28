import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("videgames.csv"));
        Game[] games = new Game[3588];
        scanner.nextLine();
        int counter = 0;
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            s = removeCommaInName(s);
            String[] arr = s.split(",");
            System.out.println(counter);
            Game game = new Game(arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],
                    parsePrice(arr[7]),arr[8],Boolean.parseBoolean(arr[9]));
            games[counter] = game;
            counter++;
        }
        System.out.println(games);
    }

    public static Boolean parseBoolean(String s){
        if (s.equals("True") || s.equals("yes")) return true;
        return false;
    }


    public static String removeCommaInName(String string){
        string.replaceAll("\".*\"","");
        boolean hasQuoteStart = false;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '"'){
                chars[i] = ' ';
                hasQuoteStart = !hasQuoteStart;
            }
            if (chars[i] == ',' && hasQuoteStart){
                chars[i] = ' ';
            }
        }
        return new String(chars);
    }

    public static Double parsePrice(String price){
        String s = price.replaceAll(" ", "");
        return Double.parseDouble(s);
    }
}

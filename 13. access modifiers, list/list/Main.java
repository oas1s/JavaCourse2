package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        list.remove(0);
        for (int i = 0; i < 2; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {

        }
    }
}

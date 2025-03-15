import generics.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Old java
        List list = new ArrayList();
        list.add(1);
        list.add(new Animal(13));
        Integer integer = (Integer) list.get(1);


        // New Java
        List<Integer> integers = new ArrayList<>();
        integers.get(0).intValue();
        List<String> strings = new ArrayList<>();
    }
}

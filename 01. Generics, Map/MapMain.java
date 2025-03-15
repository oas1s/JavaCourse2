import generics.Animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, Animal> map =
                new HashMap<>();
        map.put(1,new Animal(13));
        map.put(2,new Animal(12));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(1).hashCode());
    }
}

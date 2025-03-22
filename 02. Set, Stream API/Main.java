import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        Set<Integer> integers1 = new LinkedHashSet<>();
        Set<Integer> integers2 = new TreeSet<>((v1,v2) -> v1.compareTo(v2));
        List<Integer> integers3 = new ArrayList<>();
    }
}

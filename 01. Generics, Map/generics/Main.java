package generics;

public class Main {
    public static void main(String[] args) {
        Printer<Integer,String> integerPrinter = new
                Printer<>(1,"sda");
//        Printer<Animal> animalPrinter =
//                new Printer<>(new Animal(13));
        integerPrinter.print("some");
//        animalPrinter.print();

    }
}

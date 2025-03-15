package interfaces;

public class Main {
    public static void main(String[] args) {
        PrintNameI a = new Cat("Tom","siberian");
        a.printName();
        PrintNameI b = new Human("Azat",24);
        b.printName();
    }
}

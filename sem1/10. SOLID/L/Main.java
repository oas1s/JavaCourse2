package L;

public class Main {
    public static void main(String[] args) {
        Bird a = new NewBird();
        Bird b = new WrongBird();
        a.fly();
        b.fly();
    }
}

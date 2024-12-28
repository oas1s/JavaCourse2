package I;

public class IronMan implements Runnable,Flyable{
    @Override
    public void fly() {
        System.out.println("Iron man fly");
    }

    @Override
    public void run() {
        System.out.println("Iron man run");
    }
}

package interface_abstract_class;

public class Main {

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.plantEggs();
        eagle.sing();
        eagle.prepateToFly();
        eagle.type = "some type";
        System.out.println(eagle.type);
    }

    static class Eagle extends Bird implements Flyable{
        String name;

        @Override
        void sing() {
            System.out.println("chirik");
        }

        @Override
        public void fly() {
            System.out.println("vzletttt");
        }

        @Override
        public void plantEggs(){
            System.out.println("sinitsa plant eggs");
        }
    }
    abstract static class Bird {
        String type;
        int age;

        abstract void sing();

        void plantEggs(){
            System.out.println("planting eggs");
        }
    }

    interface Flyable {
        void fly();

        default void prepateToFly(){
            System.out.println("prepating......");
        }
    }
}

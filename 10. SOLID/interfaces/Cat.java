package interfaces;

public class Cat implements PrintNameI{
    public String name;
    public String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }


    @Override
    public void printName() {
        System.out.println(name);
    }
}

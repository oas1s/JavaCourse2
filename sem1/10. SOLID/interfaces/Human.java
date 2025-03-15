package interfaces;

public class Human implements PrintNameI,PrintAgeI{
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void printAge() {
        System.out.println(age);
    }
}

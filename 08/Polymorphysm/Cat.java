package Polymorphysm;

public class Cat {
    public String name;

    public void meow(){
        System.out.println("Meow from cat");
    }

    @Override
    public String toString(){
        return "Cat with name " + this.name;
    }
}

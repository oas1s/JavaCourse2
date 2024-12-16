package Polymorphysm;

public class RealCat extends Cat{

    public RealCat(int age){
        super();
        this.age = age;
    }

    public int age;

    @Override
    public String toString(){
        return "Cat with name " + this.name + " and age " + this.age;
    }
}

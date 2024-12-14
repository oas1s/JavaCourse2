import java.util.Objects;

public class Cat {

    public String name;

    public Cat(String name){
        this.name = name;
    }

    public void meow(){
        System.out.println("Meow, " + "from " + name);
    }

    public String meow1(){
        return "Meow, " + "from " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

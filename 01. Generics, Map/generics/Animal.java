package generics;

import java.util.Objects;

public class Animal {
    Integer age;

    public Animal(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(age, animal.age);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }
}

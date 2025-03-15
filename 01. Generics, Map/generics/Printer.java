package generics;

public class Printer<T,V> {



    T value;
    V secondValue;

    public Printer(T value, V secondValue) {
        this.value = value;
        this.secondValue = secondValue;

    }

    public <V> T print(V some){
        return value;
    }
}

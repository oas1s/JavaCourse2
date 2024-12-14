package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(new int[][]{{1,2,3},{4,5,6}});
        System.out.println(m.getElement(5,5));
        m.setElement(0,0,5);
        System.out.println(m.getElement(0,0));
    }
}

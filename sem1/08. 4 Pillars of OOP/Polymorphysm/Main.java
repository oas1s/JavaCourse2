package Polymorphysm;

public class Main {
    public static void main(String[] args) {
        Cat realCat = new RealCat(13);
        Cat cartoonCat = new CartoonCat();
        realCat.name = "Vasya";
        cartoonCat.name = "Tom";
        System.out.println(realCat);
        System.out.println(cartoonCat);
    }
}

package S;

public class Main {
    public static void main(String[] args) {
        // Not correct
        String s = "1212";
        WrongBird wrongBird = new WrongBird();
        wrongBird.setAge(wrongBird.convertToInt(s));

        //Correct
        RightBird rightBird = new RightBird();
        rightBird.setAge(Util.convertToInt(s));
    }
}

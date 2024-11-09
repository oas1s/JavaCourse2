import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c
                = scanner.nextDouble(), x =scanner.nextDouble(), y= scanner.nextDouble();
        double max = Math.max(x,y);
        double min = Math.min(x,y);

        // 3 4 5
        double brickMin1 = 0;
        double brickMin2 = 0;

        if (a < b) {
            brickMin1 = a;
            brickMin2 = Math.min(b,c);
        } else {
            brickMin1 = b;
            brickMin2 = Math.min(a,c);
        }

        if (Math.min(brickMin1,brickMin2)<=min && Math.max(brickMin1,brickMin2) <= max ){
            System.out.println("Brick goes through hole");
        } else {
            System.out.println("Brick not going through hole");
        }

    }

}

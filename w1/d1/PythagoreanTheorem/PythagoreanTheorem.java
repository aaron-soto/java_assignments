import java.lang.Math;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        int legA = 5;
        int legB = 5;

        double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
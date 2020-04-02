package javaproject.stringinterpolation;

public class StringInterpolation {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;

        System.out.println("sum of " + x + " plus " + y + " equals " + (x + y));
        System.out.println(String.format("sum of %d plus %d equals %d", x, y, x + y));
    }
}

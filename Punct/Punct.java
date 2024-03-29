package Punct;

/**
 * Punct
 */
public class Punct {

    private double x;
    private double y;

    public Punct(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Punct(x = " + x + ", y = " + y + ")";
    }

    public static void main(String[] args) {
        Punct punct = new Punct(25, 34);
        System.out.println(punct);
    }
}
package Punct;

/**
 * PunctColorat
 */
public class PunctColorat extends Punct {

    private double c;

    public PunctColorat(double x, double y, double c) {
        super(x, y);
        this.c = c;
    }

    public String toString() {
        return "PunctColorat de culoare c = " + c;
    }

    public static void main(String[] args) {
        PunctColorat punctColorat = new PunctColorat(25, 34, 37);
        System.out.println(punctColorat);
    }
}
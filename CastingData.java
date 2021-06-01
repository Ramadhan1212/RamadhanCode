package Pertemuan9dan10.ControlStatementProject;

public class CastingData {

    public static void main(String[] args) {
        // local variable
        byte a = 50;
        int b = 5;
        float c = 2;
        int d = (int)(a*b/c);
        int e = (int)(a*b)/251;

        System.out.println("a = " + a +
                "\nb = " + b +
                "\nc = " + c +
                "\nd = " + d +
                "\ne = " + e);

    }
}

package calcul;

public class Calculatrice {
    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Division par zéro interdite");
        }
        return (double) a / b;
    }
}

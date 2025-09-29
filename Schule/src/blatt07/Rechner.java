package blatt07;

public class Rechner {
    /**
     * Berechnet die Summe der Zahlen und speichert diese als double c.
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Gibt die Variable c aus.
     */
    public static double add (double a, double b) {
        double c = a + b;
        return c;
    }

    /**
     * Berechnet die Differenz der Zahlen und speichert diese als double c.
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Gibt die Variable c aus.
     */
    public static double sub (double a, double b) {
        double c = a - b;
        return c;
    }

    /**
     * Berechnet das Produkt der Zahlen und speichert dieses als double c.
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Gibt die Variable c aus.
     */
    public static double mul (double a, double b) {
        double c = a * b;
        return c;
    }

    /**
     * Berechnet den Quotienten der Zahlen und speichert diesen als double c.
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Gibt die Variable c aus.
     */
    public static double div (double a, double b) {
        double c = a / b;
        return c;
    }

    /**
     * Gibt die Summe, Differenz, das Produkt und den Quotienten der Zahlen aus.
     * @param a Zahl 1
     * @param b Zahl 2
     */
    public static void rechnung (double a, double b) {
        System.out.println("Die Summe der Zahlen ist: " + add(a, b) );
        System.out.println("Die Differenz der Zahlen ist: " + sub(a, b) );
        System.out.println("Das Produkt der Zahlen ist: " + mul(a, b) );
        System.out.println("Der Quotient der Zahlen ist: " + div(a, b) );
    }

    public static void main(String[] args) {

    }
}

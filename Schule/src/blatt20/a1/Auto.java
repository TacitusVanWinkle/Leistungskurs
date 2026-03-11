package blatt20.a1;

public class Auto {
    String marke;
    String modell;
    int tank;
    int geschwindigkeit;
    int kilometerstand;

    public Auto() {
        marke = "unbekannt";
        modell = "unbekannt";
        tank = 50;
        geschwindigkeit = 0;
        kilometerstand = 0;
    }

    public Auto(String marke, String modell, int tank, int geschwindigkeit, int kilometerstand) {
        this.marke = marke;
        this.model018l = modell;
        this.tank = tank;
        this.geschwindigkeit = geschwindigkeit;
        this.kilometerstand = kilometerstand;
    }

    public Auto(Auto a) {
        this.marke = a.marke;
        this.modell = a.modell;
        this.tank = a.tank;
        this.geschwindigkeit = a.geschwindigkeit;
        this.kilometerstand = a.kilometerstand;
    }

    Auto a1 = new Auto("BMW", "M3", 60, 0, 120000);

    Auto a2 = new Auto(a1);

    public void beschleunigen(int v) {
        geschwindigkeit += v;
    }

    public void bremsen (int v) {
        geschwindigkeit -= v;
    }

    public void fahren(int km) {
        kilometerstand += km;
    }

 public static void main(String[] args) {



 }
}
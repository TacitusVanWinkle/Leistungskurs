package blatt20.a1;

public class Auto {
    private String marke;
    private String modell;
    private int tank;
    private int geschwindigkeit;
    private int kilometerstand;

    public Auto() {
        marke = "unbekannt";
        modell = "unbekannt";
        tank = 50;
        geschwindigkeit = 0;
        kilometerstand = 0;
    }

    public Auto(String marke, String modell, int tank, int geschwindigkeit, int kilometerstand) {
        this.marke = marke;
        this.modell = modell;
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

    public String getMarke(String marke) {
        return marke;
    }

    public String getModell(String modell) {
        return modell;
    }

    public int getTank(int tank) {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
        if (tank < 0) {
            this.tank = 0;
        }
    }

    public int getGeschwindigkeit(int geschwindigkeit) {
        return geschwindigkeit;
    }
    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
        if (geschwindigkeit < 0) {
            this.geschwindigkeit = 0;
        }
    }

    public int getKilometerstand(int kilometerstand) {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
        if (kilometerstand < 0) {
            this.kilometerstand = 0;
        }
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
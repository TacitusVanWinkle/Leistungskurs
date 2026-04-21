package blatt20.a3;

public class Smartphone {

    private String marke;
    private String modell;
    private int akkustand;
    private int preis;
    private int speicherplatz;
    private int[] displaygroesse;
    private String helligkeit;
    private int lautstearke;
    private String betriebssystem;
    private boolean aktiv;
    private int anzahlApps;
    private int freierSpeicherplatz;


    public Smartphone(int speicherplatz, int preis, String modell, String marke) {
        this.speicherplatz = speicherplatz;
        this.preis = preis;
        this.modell = modell;
        this.marke = marke;
        this.akkustand = 100;
    }

    @Override
    public boolean equals(Object o) {
        //Referenz
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Smartphone)) {
            return false;
        }
        //Cast
        Smartphone a = (Smartphone) o;
        return this.preis==(a.preis) &&
                this.speicherplatz==(a.speicherplatz);
    }

    public int getAkkustand() {
        return akkustand;
    }
    public void setAkkustand(int akkustand) {
        this.akkustand = Math.max(akkustand, 0);
        this.akkustand = Math.min(akkustand, 100);
    }

    public int getPreis() {
        return preis;
    }
    public void setPreis(int preis) {
        this.preis = Math.max(preis, 0);
    }

    public int getSpeicherplatz() {
        return speicherplatz;
    }
    public void setSpeicherplatz(int speicherplatz) {
        this.speicherplatz = Math.max(speicherplatz, 0);
    }

    void nutzen(int l) {
        setAkkustand(this.akkustand - l);
    }

    void laden(int l) {
        setAkkustand(this.akkustand + l);
    }

    public void speicherLeeren(int l) {
        this.speicherplatz = this.speicherplatz - l;
    }

    public void akkuLaden() {
        this.akkustand = 100;
    }

    public void einschalten() {
        if (this.aktiv == false) {
            this.aktiv = true;
        }
    }

    public void istAkkuLeer() {
        if (this.akkustand == 0) {
            System.out.println("Akku leer");
        } else  {
            System.out.println("Akku voll");
        }
    }

    public void appInstallieren() {
        if (hatGenugSpeicher() == true) {
            anzahlApps++;
        }
    }

    public boolean hatGenugSpeicher() {
        if (this.freierSpeicherplatz >= this.speicherplatz) {
            System.out.println("Ihr gerät hat genug Speicherplatz");
            return true;
        } else if (this.freierSpeicherplatz < this.speicherplatz) {
            System.out.println("Ihr gerät hat nicht genug Speicherplatz");
            return false;
        }
        return true;
    }
}

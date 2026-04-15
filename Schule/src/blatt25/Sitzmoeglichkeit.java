package blatt25;

public class Sitzmoeglichkeit {
    private int besetzt;
    private int sitzplaetze;

    public Sitzmoeglichkeit(int besetzt, int sitzplaetze) {
        this.besetzt = besetzt;
        this.sitzplaetze = sitzplaetze;
    }

    public int getBesetzt() {
        return besetzt;
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }

    public void hinsetzen() {
        if (this.sitzplaetze > this.besetzt) {
            this.besetzt++;
        }else  {
            System.out.println("Es sind bereits alle Sitzplätze belegt");
        }

    }

    public void aufstehen() {
        this.besetzt--;
    }

}

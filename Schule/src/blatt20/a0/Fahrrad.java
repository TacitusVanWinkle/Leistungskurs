package blatt20.a0;

import java.sql.SQLOutput;

public class Fahrrad {

    public void beschleunigen(int k) {
        int geschwindigkeit = 0;
        System.out.print("Schn");
        for (int i = 1; i <= k; i++) {
            System.out.print("e");

        }
        System.out.println("ll");
    }

    public void klingeln() {
        System.out.println("Klingeling!!!");
    }

    String marke;
    String typ;
    String farben;
    int gaenge;
    int reifendurchmesser;
    boolean existiertZulassung;
    boolean existiertRuecklicht;
    boolean existiertVorderlicht;
    boolean reflektorenAnPedalen;
    boolean reflektorenAnReifen;

    public void fahren() {
        System.out.println();
    }

    public void beschreibung() {
        System.out.println("Fahrrad" + this.farben + ", " + this.gaenge + "Gänge" + this.marke + ", " + this.typ + ", " + this.reifendurchmesser + "Zoll, " +  this.existiertRuecklicht + ", " + this.existiertVorderlicht + ", " + this.reflektorenAnReifen + ", " + this.reflektorenAnPedalen + "," + this.existiertZulassung);
    }


    public static void main(String[] args) {
        String marke = "KS-Cycling";
        String typ = "Rennrad";
        String farben = "Schwarz (Orange-blaue Akzente)";
        int reifendurchmesserCM = 60;
        boolean existiertZulassung = false;
        boolean existiertRuecklicht = true;
        boolean existiertVorderlicht = false;
        boolean reflektorenAnPedalen = true;
        boolean refloktorenAnReifen = false;

        String marke1 = "?";
        String typ1 = "Rennrad";
        String farben1 = "Silber, blau";
        int reifendurchmesser1 = 60;
        boolean existiertZulassung1 = true;
        boolean existiertRuecklicht1 = true;
        boolean existiertVorderlicht1 = true;
        boolean reflektorenAnPedalen1 = true;
        boolean refloktorenAnReifen1 = true;

        String marke2 = "Emily";
        String typ2 = "Kinder Fahrrad";
        String farben2 = "Pink";
        int reifendurchmesser2 = 20;
        boolean existiertZulassung2 = true;
        boolean existiertRuecklicht2 = false;
        boolean existiertVorderlicht2 = false;
        boolean reflektorenAnPedalen2 = true;
        boolean refloktorenAnReifen2 = false;
    }
}

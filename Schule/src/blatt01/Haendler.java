package blatt01;

public class Haendler {

    public static void main(String[] args) {

        int anzahlNormal = 9;
        int anzahlMini = 5;
        int anzahlMicro = 0;

        double preisNormal = 5;
        double preisMini = 8;
        double preisMicro = 12;

        System.out.println("Der Preis für...\n" + anzahlNormal + " normale SD-karten\n" + anzahlMini + " mini SD-Karten\n" + anzahlMicro + " micro SD-Karten\n" + "...lautet " + (anzahlMini * preisMini + anzahlNormal * preisNormal + anzahlMicro * preisMicro));

    }

}

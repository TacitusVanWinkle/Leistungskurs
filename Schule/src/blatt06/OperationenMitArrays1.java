package blatt06;

public class OperationenMitArrays1 {
    public static void main(String[] args) {
        int[] auftraege =  new int[]{9000, 23000, 41000, 6000, 13000, 22000, 38000, 16000, 7000, 14000, 12000, 5000, 17000};
        int summe = 0;
        for (int a = 0; a < auftraege.length; a++) {
            System.out.println( auftraege[a] + " €" );
            summe += auftraege[a];
            if (auftraege[a] >= 15000) {
                System.out.println("Die anzahl aller Auftäge, deren Wert über 15000 Euro liegt ist: ");
            }
        }

        System.out.println("Die Summe aller Auftragswerte ist: " + summe + " €");

        }
    }

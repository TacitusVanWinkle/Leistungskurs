package blatt14;

import schisch_visualizer.SchischVisualizer;

public class OasenSuche {

    static char[][] spielfeld;

    public static void initialisiereSpielfeld(int l, int b) {
        spielfeld = new char[l][b];
        Simulationen.fuellen(spielfeld,' ',1);
    }

    public static void zufallsPositionSpieler() {
        Simulationen.platzieren(spielfeld,'P',true);
    }

    public static void wasserZufall(double ws) {
        if (ws >= 0 && ws <= 1) {
            Simulationen.fuellen(spielfeld,'6',ws,' ');
        }
    }

    public static void steinZufall(double ws) {
        if (ws >= 0 && ws <= 1) {
            Simulationen.fuellen(spielfeld,'A',ws,' ');
        }
    }

    public static int[] findeSpieler() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == 'P') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void findeWasser(SchischVisualizer sv, int energy) {
        int Weg = blatt13.Zufall.zufallGanz(0, 4);
        if (Weg == 0) {

        }
    }




    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        initialisiereSpielfeld(60,60);
        zufallsPositionSpieler();
        sv.step(spielfeld);
        wasserZufall(0.1);
        sv.step(spielfeld);
        steinZufall(0.3);
        sv.step(spielfeld);
        sv.start();
        blatt07.ArbeitMitArrays.printArray(findeSpieler());
    }
}

package blatt15;
import blatt14.MultiArrays;
import schisch_visualizer.*;

public class Farben {

    static int[] spielerPosX;
    static int[] spielerPosY;
    static int[] reihenfolge;
    static char[][] spielfeld;

    public static void initialisiereSpielfeld () {
        spielfeld = MultiArrays.createEmpty2DCharArray(80, 80);
        for (int i = 0; i < 80; i++) {
                spielfeld[0][i] = '8';
                spielfeld[79][i] = '8';
                spielfeld[i][0] = '8';
                spielfeld[i][79] = '8';
            }
        }

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        initialisiereSpielfeld();
        sv.step(spielfeld);
        sv.start();

    }

}

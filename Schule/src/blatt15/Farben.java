/*package blatt15;
import blatt14.MultiArrays;
import schisch_visualizer.*;

public class Farben {

    static int[] spielerPosX;
    static int[] spielerPosY;
    static int[] reihenfolge;
    static char[][] spielfeld;

    public static void initialisiereSpielfeld () {
        spielfeld = MultiArrays.createEmpty2DCharArray(40, 40);
        for (int i = 0; i < 40; i++) {
                spielfeld[0][i] = '8';
                spielfeld[39][i] = '8';
                spielfeld[i][0] = '8';
                spielfeld[i][39] = '8';
            }
        }

    public static void startPositionen () {
        for (int i = spielfeld.length - 1; i >= 0; i--) {
            if (i = spielfeld.length / 2) {

            }
        }
    }

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        initialisiereSpielfeld();
        sv.step(spielfeld);
        sv.start();

    }

}
*/
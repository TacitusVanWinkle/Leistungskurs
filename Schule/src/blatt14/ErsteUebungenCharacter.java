package blatt14;

import schisch_visualizer.*;

public class ErsteUebungenCharacter {



    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();

        char[][] charr = MultiArrays.createEmpty2DCharArray(11,14);
        sv.step(charr);
        sv.start();

    }
}

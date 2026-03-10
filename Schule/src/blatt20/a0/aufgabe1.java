package blatt20.a0;

public class aufgabe1 {

    int bohnen;
    int wasser;
    int dreck;
    int kaffesatz;

    public void bohnenAuffuellen(int maximaleBohnen) {
        this.bohnen = maximaleBohnen;
    }

    public void wasserAuffuellen(int maximalesWasser) {
        this.wasser = maximalesWasser;
    }

    public void wasserLeeren() {
        this.wasser = 0;
    }

    public void wasserReinigen() {
        this.dreck = 0;
    }

    public void kaffesatzLeeren() {
        this.kaffesatz = 0;
    }

    public void kaffeeZiehen() {
        if (dreck < 50) {
            System.out.println("Kaffee fertig!");
            dreck++;
        }

        if (dreck > 50 && dreck < 75) {
            int zufall1 = blatt13.Zufall.zufallGanz(0, 3);
            if (zufall1 == 1) {
                System.out.println("Kaffemaschine fehlgeschlagen");
            } else {
                System.out.println("Kaffee fertig!");
                dreck++;
            }
        }

        if (dreck >= 75 && dreck < 90) {
            int zufall2 = blatt13.Zufall.zufallGanz(0, 1);
            if (zufall2 == 1) {
                System.out.println("Kaffemaschine fehlgeschlagen");
            } else {
                System.out.println("Kaffee fertig!");
                dreck++;
            }
        }
        if (dreck >= 90) {
            System.out.println("Kaffemaschine fehlgeschlagen");
        }
    }


    public static void main(String[] args) {

    }
}


package blatt20.a2;

public class Kochfeld {
    String groeße;
    int hitzestufe;

    public void hitzeErhoehen() {
        if (hitzestufe < 6) {
            hitzestufe++;
        }
    }

    public void hitzeSenken() {
        if (hitzestufe > 0) {
            hitzestufe--;
        }
    }
}

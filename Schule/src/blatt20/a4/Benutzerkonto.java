package blatt20.a4;

public class Benutzerkonto {

    private String benutzername;
    private String email;
    private String geburtstag;
    private String passwort;
    private int guthaben;
    private String meinGutscheincode;
    private String erstellungsdatum;

    public Benutzerkonto(String benutzername, String email, String geburtstag, String passwort, String erstellungsdatum, String meinGutscheincode) { //TODO: für Gutscheinguthaben einen default;
                                                                                                                            // passwort & meinGutscheincode fehlen als Parameter
                                                                                                                            // Erstellungsdatum fehlt
        this.benutzername = benutzername;
        this.email = email;
        this.geburtstag = geburtstag;
        this.passwort = passwort;
        this.guthaben = 0;
        this.erstellungsdatum = erstellungsdatum;
        this.meinGutscheincode = meinGutscheincode;
    }

    public void anmelden() {

    }

    public void passwortAendern(String altesPasswort, String neuesPasswort) {
        if (this.passwort.equals(altesPasswort)) {
            this.passwort = neuesPasswort;
        }
    }

    public void gutscheinEinloesen( String gutscheinCode) {

        if (gutscheinCode.equals(meinGutscheincode)) {
            this.guthaben += 20;
        }
    }


    //TODO: Nutzer kann sich an- und abmelden und Guthaben einsehen
}

package blatt20.a4;

public class Benutzerkonto {

    private String benutzername;
    private String email;
    private String geburtstag;
    private String passwort;
    private int guthaben;

    public Benutzerkonto(String benutzername, String email, String geburtstag, int Gutscheinguthaben) {
        this.benutzername = benutzername;
        this.email = email;
        this.geburtstag = geburtstag;
        this.passwort = passwort;
        this.guthaben = 0;
    }

    public void passwortAendern(String altesPasswort, String neuesPasswort) {
        if (this.passwort.equals(altesPasswort)) {
            this.passwort = neuesPasswort;
        }
    }

    public void gutscheinEinloesen(int gutscheinGuthaben, String gutscheinCode) {
        this.guthaben += gutscheinGuthaben;
    }
}

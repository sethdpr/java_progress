package Bankrekening_package;

public class Persoon {
    private String voornaam;
    private String achternaam;
    private int geboortejaar;

    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }
}

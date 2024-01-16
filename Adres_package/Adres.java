package Adres_package;

public class Adres {
    private String straatnaam;
    private int huisnummer;
    private String bus;
    private int postcode;
    private String stadGemeente;

    public Adres(String straatnaam, int huisnummer, String bus, int postcode, String stadGemeente){
            this.straatnaam = straatnaam;
            this.huisnummer = huisnummer;
            this.bus = bus;
            this.postcode = postcode;
            this.stadGemeente = stadGemeente;
    }
    public String getStraatnaam(){
        return straatnaam;
    }
    public void setStraatnaam(String straatnaam){
        this.straatnaam = straatnaam;
        if (this.straatnaam.length() < 5){
            this.straatnaam = "Bodemstraat";
        }
    }
    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
        if (this.huisnummer > 20000){
            this.huisnummer = 5;
        }
    }
    public String getBus(){
        return bus;
    }
    public void setBus(String bus){
        this.bus = bus;
        if (this.bus.length() > 1){
            this.bus = "B";
        }
    }
    public int getPostcode(){
        return postcode;
    }
    public void setPostcode(int postcode){
        this.postcode = postcode;
        if (this.postcode < 1000 || this.postcode > 9999){
            this.postcode = 1000;
        }
    }
    public String getStadGemeente(){
        return stadGemeente;
    }
    public void setStadGemeente(String stadGemeente) {
        this.stadGemeente = stadGemeente;
        if (this.stadGemeente.isEmpty()){
            this.stadGemeente = "BRUSSEL";
        }
    }
    @Override
    public String toString(){
        return "Adres_package.Adres: " + straatnaam + " " + huisnummer + bus + ", " + postcode + " " + stadGemeente;
    }
}

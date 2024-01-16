package Cirkel_package;

public class Cirkel {
    private String naam;
    private double straal;
    private String kleur;

    public Cirkel(String naam){
        this.naam = naam;
        this.straal = 0;
        this.kleur = "wit";
    }
    public void geefOmtrek(){
        double omtrek = 2 * Math.PI * straal;
        System.out.println(omtrek);
    }
    public void geefOppervlakte(){
        double oppervlakte = straal * straal * Math.PI;
        System.out.println(oppervlakte);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    @Override
    public String toString(){
        return "de kleur van cirkel " + naam + " is " + kleur + " en de straal van de cirkel is " + straal;
    }
}

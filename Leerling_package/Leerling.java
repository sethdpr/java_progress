package Leerling_package;

public class Leerling {
    private String naam;
    private int leerjaar;
    private int niveau;

    public Leerling (String naam){
        this.naam = naam;
    }

    public int getLeerjaar() {
        return leerjaar;
    }

    public void setLeerjaar(int leerjaar) {
        this.leerjaar = leerjaar;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void verhoogNiveau(){
        this.niveau = niveau + 1;
    }

    @Override
    public String toString(){
        return naam + " zit in het " + leerjaar + "e leerjaar en beheert leesniveau " + niveau;
    }
}

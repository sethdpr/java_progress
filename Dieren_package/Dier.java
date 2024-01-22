package Dieren_package;

public abstract class Dier{
    private String naam;

    public Dier(){
        this.naam = "naam";
    }
    public Dier(String naam){
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public abstract void maakGeluid();
}

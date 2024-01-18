package Personen_package;

public class Adres {
    private String stad;
    private String land;

    public Adres(String stad, String land){
        this.stad = stad;
        this.land = land;
    }
    public Adres(){
        this.stad = "onbekend";
        this.land = "België";
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
    @Override
    public String toString(){
        return "[Personen_package.Adres: " + stad + ", " + land + "]";
    }
}

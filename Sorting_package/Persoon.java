package Sorting_package;

public class Persoon {
    private int id;
    private String naam;

    public Persoon(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    @Override
    public String toString(){
        return id + ", " + naam;
    }
}

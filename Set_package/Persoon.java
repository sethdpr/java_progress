package Set_package;

public class Persoon implements Comparable<Persoon> {
    private int id;
    private String naam;

    public Persoon(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    @Override
    public int compareTo(Persoon o) {
        return this.naam.compareTo(o.naam);
    }
    @Override
    public String toString(){
        return id + ", " + naam;
    }
}

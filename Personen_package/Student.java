package Personen_package;

public class Student extends Persoon {
    private String specialisatie;

    public Student(String naam, Adres adres, String specialisatie){
        super(naam, adres);
        this.specialisatie = specialisatie;
    }

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }
    @Override
    public String toString(){
        return "[Personen_package.Student " + getId() + ": " + getNaam() + ", " + getAdres() + ", " + specialisatie + "]";
    }
}

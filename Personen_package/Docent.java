package Personen_package;

public class Docent extends Persoon {
    private String specialisatie;
    private String[] studentenlijst;

    public Docent(String naam, Adres adres, String specialisatie, String[] studentenlijst){
        super(naam, adres);
        this.specialisatie = specialisatie;
        this.studentenlijst = new String[20];
    }
    public Docent(String naam, Adres adres, String specialisatie){
        super(naam, adres);
        this.specialisatie = specialisatie;
        this.studentenlijst = new String[20];
    }

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }
    public boolean voegStudentToe(Student student){
        for (int i = 0; i < studentenlijst.length; i++){
            if (studentenlijst[i] == null){
                studentenlijst[i] = student.getNaam();
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return "[Personen_package.Docent " + getId() + ": " + getNaam() + ", " + getAdres() + ", " + specialisatie +  " " + Arrays.toString(studentenlijst) + "]";
    }
}

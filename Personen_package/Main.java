package Personen_package;

public class Main {
    public static void main(String[] args) {
        Adres a1 = new Adres();
        a1.setStad("brussel");
        Persoon p1 = new Persoon();
        p1.setNaam("Frans Dewitte");
        p1.setAdres(a1);
        Adres a2 = new Adres();
        a2.setStad("Kidal");
        a2.setLand("Mali");
        Persoon p2 = new Persoon("Mahou Diabate", a2);
        System.out.println("er zijn in totaal " + p2.getId() + " personen");
        System.out.println(p1);
        System.out.println(p2);

        Student s1 = new Student("seth de preter", new Adres("lot", "belgië"), "prg");
        System.out.println(s1);
        Docent d1 = new Docent("robin bervoets", new Adres("brussel", "belgië"), "java");
        d1.voegStudentToe(s1);
        System.out.println(d1);
    }
}

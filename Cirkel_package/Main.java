package Cirkel_package;

public class Main {
    public static void main(String[] args) {
        Cirkel cirkel1 = new Cirkel("c1");
        Cirkel cirkel2 = new Cirkel("c2");
        cirkel2.setKleur("blauw");
        cirkel2.setStraal(5.5);
        System.out.println(cirkel1);
        System.out.println(cirkel2);
        cirkel2.geefOmtrek();
        cirkel2.geefOppervlakte();
    }
}

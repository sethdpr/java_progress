package Dieren_package;

public class Main {
    public static void main(String[] args) {
        Dier lassie = new Hond("lassie");
        Dier ester = new Kat("ester");
        Dier dimpel = new Eend("dimpel");
        Dier sissy = new Slang("sissy");
        lassie.maakGeluid();
        ester.maakGeluid();
        dimpel.maakGeluid();
        ((Slang) sissy).vervel();

    }
}
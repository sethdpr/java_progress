package Dieren_package;

public class Kat extends Dier {
    public Kat(String naam){
        super(naam);
    }
    @Override
    public void maakGeluid(){
        System.out.println(getNaam() + ": miauw");
    }
}

package Dieren_package;

public class Hond extends Dier {
    public Hond(String naam){
        super(naam);
    }
    @Override
    public void maakGeluid(){
        System.out.println(getNaam() + ": waf");
    }
}

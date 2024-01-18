package Dieren_package;

public class Eend extends Dier {
    public Eend(String naam){
        super(naam);
    }
    @Override
    public void maakGeluid(){
        System.out.println(getNaam() + ": kwak");
    }
}

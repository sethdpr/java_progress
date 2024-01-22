package Dieren_package;
public class Slang extends Dier {
    public Slang(String naam){
        super(naam);
    }

    public void vervel(){
        System.out.println(getNaam() + ": ik vervel");
    }
    @Override
    public void maakGeluid() {
        System.out.println("sss...");
    }
}

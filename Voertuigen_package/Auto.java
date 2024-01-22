package Voertuigen_package;

public class Auto extends Voertuig {
    public Auto(String merk, String model){
        super(merk, model);
    }

    @Override
    public String toString(){
        return "[auto: " + getMerk() + " " + getModel() + "]";
    }
}

package Voertuigen_package;

public class Moto extends Voertuig {
    public Moto(String merk, String model){
        super(merk, model);
    }

    @Override
    public String toString(){
        return "[moto: " + getMerk() + " " + getModel() + "]";
    }
}

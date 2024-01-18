package Voertuigen_package;

public class Voertuig {
    private String merk;
    private String model;
    public Voertuig(String merk, String model){
        this.merk = merk;
        this.model = model;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString(){
        return "[voertuig: " + merk + " " + model + "]";
    }
}

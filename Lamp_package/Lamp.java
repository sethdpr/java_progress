package Lamp_package;

public class Lamp {
    String merk;
    int vermogen;
    public Lamp(){

    }
    public String getMerk(){
        return merk;
    }
    public int getVermogen(){
        return vermogen;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setVermogen(int vermogen){
        this.vermogen = vermogen;
    }
    @Override
    public String toString(){
        return "Kenmerken van de lamp: " + this.merk + ", " + this.vermogen + " Watt";
    }
}
package Voertuigen_package;

public class Bus extends Voertuig {
    private int maxPasagiers;
    private int huidigePasagiers;

    public Bus(String merk, String model, int maxPasagiers){
        super(merk, model);
        this.maxPasagiers = maxPasagiers;
    }

    public int getMaxPasagiers() {
        return maxPasagiers;
    }

    public void setMaxPasagiers(int maxPasagiers) {
        this.maxPasagiers = maxPasagiers;
    }

    public int getHuidigePasagiers() {
        return huidigePasagiers;
    }

    public void setHuidigePasagiers(int huidigePasagiers) {
        this.huidigePasagiers = huidigePasagiers;
    }
    public boolean opstap(){
        if (huidigePasagiers >= maxPasagiers){
            return false;
        }
        else {
            huidigePasagiers++;
            return true;
        }
    }
    public boolean afstap(){
        if (huidigePasagiers <= 0){
            return false;
        }
        else {
            huidigePasagiers--;
            return true;
        }
    }
    @Override
    public String toString(){
        return "[bus: " + getMerk() + " " + getModel() + ", " + "max pasagiers: " + maxPasagiers + ", " + "huidig aantal pasagiers: " + huidigePasagiers + "]";
    }
}

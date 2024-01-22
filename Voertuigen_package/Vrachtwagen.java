package Voertuigen_package;

public class Vrachtwagen extends Voertuig {
    private int maxLaadvermogen;
    private int huidigeLading;
    private String extraTrailer;

    public Vrachtwagen(String merk, String model, int maxLaadvermogen, String extraTrailer){
        super(merk, model);
        this.maxLaadvermogen = maxLaadvermogen;
        this.extraTrailer = extraTrailer;
    }

    public int getMaxLaadvermogen() {
        return maxLaadvermogen;
    }

    public void setMaxLaadvermogen(int maxLaadvermogen) {
        this.maxLaadvermogen = maxLaadvermogen;
    }

    public int getHuidigeLading() {
        return huidigeLading;
    }

    public void setHuidigeLading(int huidigeLading) {
        this.huidigeLading = huidigeLading;
    }

    public String getExtraTrailer() {
        return extraTrailer;
    }

    public void setExtraTrailer(String extraTrailer) {
        this.extraTrailer = extraTrailer;
    }
    public void laden(int gewicht){
        huidigeLading += gewicht;
        if (huidigeLading > maxLaadvermogen){
            huidigeLading -= gewicht;
        }
    }
    public void lossen(){
        huidigeLading = 0;
    }
    @Override
    public String toString(){
        return "[vrachtwagen: " + getMerk() + " " + getModel() + ", " + extraTrailer +  ", " + "laadvermogen: " + maxLaadvermogen + "T, " + "huidige lading: " + huidigeLading + "T]";
    }
}

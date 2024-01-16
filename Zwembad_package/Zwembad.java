package Zwembad_package;

public class Zwembad {
    private double straalZwembad;
    private double breedtePad;
    private double prijspm2Pad;
    private double prijspmOmheining;

    public Zwembad (double straalZwembad, double breedtePad, double prijspm2Pad, double prijspmOmheining){
        this.straalZwembad = straalZwembad;
        this.breedtePad = breedtePad;
        this.prijspm2Pad = prijspm2Pad;
        this.prijspmOmheining = prijspmOmheining;
    }
    public double berekenPrijsPad(){
        return ((straalZwembad * 2 * Math.PI) * breedtePad) * prijspm2Pad;
    }
    public double berekenPrijsOmheining(){
        return ((straalZwembad + breedtePad) * 2 * Math.PI) * prijspmOmheining;
    }
}

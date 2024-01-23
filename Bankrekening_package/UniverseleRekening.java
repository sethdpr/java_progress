package Bankrekening_package;

public class UniverseleRekening {
    private Volmachthouder volmachthouder;

    public void toevoegenVolmacht(Volmachthouder volmachthouder){
        this.volmachthouder = volmachthouder;
    }
    public void verwijderenVolmacht(Volmachthouder volmachthouder) throws PersoonHeeftGeenVolmachtException{
        if (volmachthouder!= null && volmachthouder.equals(this.volmachthouder)){
            this.volmachthouder = null;
        } else {
            throw new PersoonHeeftGeenVolmachtException();
        }
    }
    public void controleerVolmacht(Persoon persoon) throws PersoonHeeftGeenVolmachtException{
        if (persoon.getAchternaam().equals(volmachthouder.getAchternaam())){
            System.out.println(persoon + " heeft de volmacht over deze rekening");
        }
        else {
            throw new PersoonHeeftGeenVolmachtException();
        }
    }
    public void toonVolmachthebber(){
        if (volmachthouder == null){
            System.out.println("Deze rekening heeft nog geen volmachthouder");
        }
        else {
            System.out.println(volmachthouder + " is de volmachthouder van deze rekening");
        }
    }
}

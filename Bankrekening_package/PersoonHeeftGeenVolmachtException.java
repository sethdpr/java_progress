package Bankrekening_package;

public class PersoonHeeftGeenVolmachtException extends Exception {
    public PersoonHeeftGeenVolmachtException() {
        super("Deze persoon heeft geen volmacht!");
    }
}

package Som_package;

public class Som{
    private int getal1;
    private int getal2;
    final int ONDERLOOP = 0;
    final int OVERLOOP = 100;

    public Som(int getal1, int getal2){
        this.getal1 = getal1;
        this.getal2 = getal2;
    }


    public int berekening() throws OverloopException, OnderloopException {
        int som = getal1 + getal2;
        if (som < ONDERLOOP){
            throw new OnderloopException(som);
        }
        else if (som > OVERLOOP){
            throw new OverloopException(som);
        }
        return som;
    }

}

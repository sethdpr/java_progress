package Som_package;

public class OverloopException extends Exception{
    public OverloopException(int som){
        super(som + " is groter dan 100!");
    }
}

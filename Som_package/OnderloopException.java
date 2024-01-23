package Som_package;

public class OnderloopException extends Exception{
    public OnderloopException(int som){
        super(som + " is kleiner dan 0!");
    }
}

package Som_package;

public class Main {
    public static void main(String[] args) {
        Som s1 = new Som(5, 49);
        try {
            System.out.println(s1.berekening());
        } catch (OverloopException e){
            System.out.println(e.getMessage());
        } catch (OnderloopException e){
            System.out.println(e.getMessage());
        }
    }
}

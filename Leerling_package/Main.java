package Leerling_package;

public class Main {
    public static void main(String[] args) {
        Leerling Seth = new Leerling("Seth");
        Leerling Mozes = new Leerling("Mozes");
        Seth.setLeerjaar(5);
        Mozes.setLeerjaar(2);
        Seth.setNiveau(5);
        Mozes.setNiveau(0);
        Seth.verhoogNiveau();
        System.out.println(Seth);
        System.out.println(Mozes);
    }
}

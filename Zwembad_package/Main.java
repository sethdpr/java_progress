package Zwembad_package;

public class Main {
    public static void main(String[] args) {
        Zwembad z = new Zwembad(7, 1.5, 10, 12);
        System.out.println(z.berekenPrijsPad());
        System.out.println(z.berekenPrijsOmheining());
        System.out.println(z.berekenPrijsOmheining() + z.berekenPrijsPad());
    }
}

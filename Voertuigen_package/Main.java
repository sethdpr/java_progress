package Voertuigen_package;

public class Main {
    public static void main(String[] args) {
        Voertuigen_package.Voertuig voertuigSeth = new Voertuigen_package.Voertuig("trek", "mtb");
        System.out.println(voertuigSeth);

        Voertuigen_package.Auto autoSeth = new Voertuigen_package.Auto("volkswagen", "polo");
        System.out.println(autoSeth);

        Voertuigen_package.Moto motoSeth = new Voertuigen_package.Moto("ducati", "triumph");
        System.out.println(motoSeth);

        Voertuigen_package.Bus busKamp = new Voertuigen_package.Bus("chevrolet", "bell tours", 90);
        busKamp.setHuidigePasagiers(0);
        busKamp.opstap();
        busKamp.opstap();
        busKamp.opstap();
        busKamp.afstap();
        System.out.println(busKamp);

        Voertuigen_package.Vrachtwagen thierry = new Voertuigen_package.Vrachtwagen("MAN","150",10, "zonder trailer");
        thierry.setHuidigeLading(5);
        thierry.laden(2);
        thierry.lossen();
        System.out.println(thierry);
    }
}

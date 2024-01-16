package Adres_package;

public class Main {
    public static void main(String[] args) {
        Adres adresSeth = new Adres("Bodemstraat", 5, "B", 1000, "BRUSSEL");
        adresSeth.setStraatnaam("Frans Walravensstraat");
        adresSeth.setHuisnummer(55);
        adresSeth.setBus("");
        adresSeth.setPostcode(1651);
        adresSeth.setStadGemeente("LOT");
        System.out.println(adresSeth);
    }
}

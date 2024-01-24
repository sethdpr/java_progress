package Sorting_package;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persoon> personen = new ArrayList<>();
        Scanner scanny = new Scanner(System.in);
        System.out.println("Vul naam 1 in:");
        String naam1 = scanny.next();
        System.out.println("Vul naam 2 in:");
        String naam2 = scanny.next();
        System.out.println("Vul naam 3 in:");
        String naam3 = scanny.next();
        System.out.println("Vul naam 4 in:");
        String naam4 = scanny.next();
        System.out.println("Vul naam 5 in:");
        String naam5 = scanny.next();
        Persoon pers1 = new Persoon(1, naam1);
        Persoon pers2 = new Persoon(2, naam2);
        Persoon pers3 = new Persoon(3, naam3);
        Persoon pers4 = new Persoon(4, naam4);
        Persoon pers5 = new Persoon(5, naam5);
        personen.add(pers1);
        personen.add(pers2);
        personen.add(pers3);
        personen.add(pers4);
        personen.add(pers5);
        System.out.println(personen);
    }
}

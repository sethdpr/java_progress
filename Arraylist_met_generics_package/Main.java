package Arraylist_met_generics_package;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        ArrayList<Double> getallen = new ArrayList<>();
        System.out.println("Berekenen van gemiddelde");
        double input = 0;
        double som = 0;
        while (input >= 0){
            System.out.println("Voer een getal in:");
            input = scanny.nextDouble();
            if (input >= 0){
                getallen.add(input);
            }
        }
        for (int i = 0; i < getallen.size(); i++){
            som += getallen.get(i);
        }
        double avg = som / getallen.size();
        System.out.println(getallen);
        System.out.println(som);
        System.out.println(getallen.size());
        System.out.println("Het gemiddelde van de lijst bedraagt: " + avg);

    }
}

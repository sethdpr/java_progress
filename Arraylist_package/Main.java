package Arraylist_package;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean programmaRun = true;
        Scanner scanny = new Scanner(System.in);
        ArrayList namen = new ArrayList<>();
        while (programmaRun){
            System.out.println("***MENU***");
            System.out.println("a: voeg een naam toe aan de lijst");
            System.out.println("b: afdrukken van de huidige lijst");
            System.out.println("c: bekijken van één element van de lijst");
            System.out.println("q: verlaat het programma");
            String input = scanny.next();
            switch (input){
                case "A":
                case "a":
                    String naamToevoeg = scanny.next();
                    namen.add(naamToevoeg);
                    break;
                case "B":
                case "b":
                    System.out.println(namen);
                    break;
                case "C":
                case "c":
                    int element = scanny.nextInt() - 1;
                    System.out.println(namen.get(element));
                    break;
                case "Q":
                case "q":
                    programmaRun = false;
                    break;
                default:
                    System.out.println("Dit is geen geldige input!");
                    break;
            }
        }
    }
}
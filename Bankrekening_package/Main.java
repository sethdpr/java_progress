package Bankrekening_package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankrekening zichtRekeningSeth = new Bankrekening(0, 1300);
        for (int i = 0; i < 2; i++){
            System.out.println(zichtRekeningSeth);
            Scanner scanInput = new Scanner(System.in);
            String menuInput = scanInput.next();
            switch (menuInput) {
                case "a":
                case "A":
                    zichtRekeningSeth.afhalen();
                    i--;
                    break;
                case "s":
                case "S":
                    zichtRekeningSeth.storten();
                    i--;
                    break;
                case "q":
                case "Q":
                    System.out.println("bedankt voor uw bezoek!");
                    i++;
                    break;
                default:
                    System.out.println("ongeldige invoer. probeer één van de voorgestelde invoerknoppen");
                    i--;
                    break;
            }
        }
    }
}

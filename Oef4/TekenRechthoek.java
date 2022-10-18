package Oef4;

import java.util.Scanner;

public class TekenRechthoek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char action;
        do {
            System.out.println("Geef hoogte in: ");
            int hoogte = input.nextInt();
            System.out.println("Geef breedte in: ");
            int breedte = input.nextInt();

            //teken breedte
            String teken = "";
            for (int i = 0; i < breedte ; i++) {
                teken += "*";
            }
            // teken hoogte
            for (int i = 0; i < hoogte ; i++) {
                System.out.println(teken);
            }






            // Statements
            System.out.println("Press any key to continue or q to quit");
            action = input.next().toLowerCase().charAt(0);
        }while (action != 'q');;

        System.out.println("Geef een woord of tekst in:");
    }
}

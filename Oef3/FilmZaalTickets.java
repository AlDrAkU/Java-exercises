package Oef3;

import java.util.Scanner;

public class FilmZaalTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Met hoeveel zijn jullie?");
        int groepAantal = input.nextInt();
        int korting = 0;
        int prijs = 10;
        int totalePrijs = 0;

        if (groepAantal >= 10) {
            korting = groepAantal*2;
            totalePrijs = prijs * groepAantal - korting;
            System.out.println("De totaalprijs is: "+ totalePrijs );
        } else if (groepAantal > 5){
            korting = groepAantal;
            totalePrijs = prijs * groepAantal - korting;
            System.out.println("De totaalprijs is: "+ totalePrijs );
        }
        else {
            totalePrijs = prijs * groepAantal;
            System.out.println("De totaalprijs is: "+ totalePrijs );
        }


    }
}

package Oef4;

import java.util.Scanner;

public class StudentPunten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef je punten in:");
        int punten = input.nextInt();
        if (punten <= 20 && punten >=0){

        if (punten < 10){
            System.out.println("C");
        } else if (punten <12) {
            System.out.println("B");
        } else if (punten >= 12) {
            System.out.println("A");
        }
        }
        else{
            System.out.println("Ongeldige cijfer.");
        }
    }
}

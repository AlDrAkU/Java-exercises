package Oef2;

import java.util.Scanner;

public class NaamLeeftijd {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Geef je naam in:");
        String naam = input.nextLine();
        System.out.println("Geef je geboorte jaar in:");
        int geboorteJaar = input.nextInt();

        System.out.println(naam+" is "+ (2022 - geboorteJaar)+" jaar oud");
    }
}

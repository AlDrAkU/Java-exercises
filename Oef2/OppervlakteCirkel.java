package Oef2;

import java.util.Scanner;

public class OppervlakteCirkel {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Geef de straal in:");
    double straal = input.nextDouble();
    OppervlakteCirkel Opp = new OppervlakteCirkel();
    double resultaat = Opp.Oppervlakte(straal);
    System.out.println("De oppervlakte is: "+resultaat);
    }

    public double Oppervlakte(double r) {
        System.out.println("r: "+r);
        return Math.PI * (r*r);
    }
}

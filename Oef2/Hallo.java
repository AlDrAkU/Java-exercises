package Oef2;

import java.util.Scanner;

public class Hallo {
    public static void main(String[] args) {
        System.out.println("Oef2.Hallo, Welkom in de java klas.");
        Scanner input = new Scanner(System.in);
        String naam = input.nextLine();
        System.out.println("mijn naam is "+naam+".");
    }
}

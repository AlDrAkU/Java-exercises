package Oef4;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TelKlinkers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een woord of tekst in:");
        String tekst = input.nextLine();
        int aantalklinkers = telKlinkers(tekst);
        System.out.println("Het bevat "+aantalklinkers+" klinkers.");
    }
    public static int telKlinkers(String tekst){
        char[] klinkers = new char[]{'a','A','e','E','i','I','o','O','u','U','y','Y'};
        int aantalKlinkers = 0;
        for (int i = 0; i < tekst.length(); i++) {
            char l = tekst.charAt(i); // getting letter @ index
            for (int j = 0; j < klinkers.length; j++) {
                char k = Array.getChar(klinkers,j); // getting the klinker @ index
                if (l==k){  //compare to see if klinker.
                    aantalKlinkers += 1;
                    System.out.println(l+" is een klinker");
                }
                }

        }
     return aantalKlinkers;
    }
}

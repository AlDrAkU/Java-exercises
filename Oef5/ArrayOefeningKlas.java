package Oef5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOefeningKlas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef in hoeveel namen er worden opgeslagen: ");
        int lengte = input.nextInt();
        String[] naamlijst = new String[lengte];

        for (int i = 0; i < lengte; i++) {
            System.out.println("Geef de naam nr "+(i+1)+"/"+lengte+" in.");
            naamlijst[i] = input.next();

        }
        //System.out.println(Arrays.toString(naamlijst));
        charactersOptellenInArray(lengte, naamlijst);
    }

    private static void charactersOptellenInArray(int lengte, String[] naamlijst) {
        int charsSaved = 0;
        for (int i = 0; i < lengte; i++) {
            System.out.println((i+1)+": "+ naamlijst[i]);
            charsSaved+= naamlijst[i].length();

        }
        System.out.println("Het aantal characters opgeslagen is: "+charsSaved);
    }


}

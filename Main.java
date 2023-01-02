import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Oef2.Hallo!");
        //System.out.println("Ik ben 32 jaar."); // comment
        //System.out.println("Mijn naam is Razvan.");
        int intStudent1 = 26;
        int intStudent2 = 25;
        int intSom = Main.Som(intStudent1,intStudent2);
        System.out.println(intSom+" som leeftijden.");
        //Main.bla();
        int[] arr = {20,25,32,41};
        //int som_alles = Main.SomArray(arr);
        System.out.println(Main.SomArray(arr) + " som alle leeftijden in array.");
        //Scanner sc = new Scanner(System.in);
        //int aantalStudenten = sc.nextInt();
        char c = 'c';
        System.out.println("Hello World"+c);

        //String naam = sc.nextLine();

        //System.out.println();
    };

    public static void bla() {
        System.out.println("");
    };

    public static int Som(int getal1, int getal2) {
        return getal1+getal2;
    }
    public static int SomArray(int[] leeftijden ) {
        int som = 0;
        for (int i = 0; i < leeftijden.length; i++) {
            System.out.println(leeftijden[i]);
            som = som +leeftijden[i];
        }
        return som;
    }
}


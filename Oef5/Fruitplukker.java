package Oef5;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;


public class Fruitplukker {
    public static void main(String[] args) {

        double mandTotaalPrijs = 0;
        //double prijs = 0;
        //double som = 0;
        String[] fruitbak = vulFruitbak();

        //print(fruitbak);
        mandTotaalPrijs = berekenTotaalFruitbak(fruitbak);
        System.out.println("De waarde van je mand is: " +(mandTotaalPrijs)+" Euro");
        double btw = berekenTotaalFruitbakBTW(mandTotaalPrijs);
        System.out.println("De waarde van je mand is: " +(mandTotaalPrijs+btw) +" Euro incl. btw.");
        System.out.println(Arrays.toString(fruitbak));
    }

    private static String[] vulFruitbak() {
        int lengteFruitbak =  askInputInt("Hoeveel fruit past binnen de fruitbak (5-20)?");
        while(lengteFruitbak > 20 || lengteFruitbak < 5)
        {
         print("Je hebt een ongeldige aantal ingegeven voor je fruitbak, namelijk",Integer.toString(lengteFruitbak),",probeer opnieuw.");
         lengteFruitbak = askInputInt("Hoeveel fruit past binnen de fruitbak?");
        }
        String[] fruitbak = new String[lengteFruitbak];
/*        int [] int_test = new int[lengteFruitbak];
        Boolean [] bool_test = new Boolean[lengteFruitbak];
        for (String b : fruitbak){
            System.out.println(b);
        }
        for (int j : int_test) {
            System.out.println(j);
        }
        for (Boolean k : bool_test){
            System.out.println(k);
        }
        
 */
        for (int i = 0; i < lengteFruitbak; i++) {
            String fruit =  askInputStr("Welke stukken fruit pluk je? (keuze: G, R, P):");
            while(!fruit.equalsIgnoreCase("g")&& !fruit.equalsIgnoreCase("r")&&!fruit.equalsIgnoreCase("p"))
            {
                print("Je hebt een ongeldige fruit ingegeven, namelijk",fruit,",probeer opnieuw.");
                fruit =  askInputStr("Welke stukken fruit pluk je? (keuze: G, R, P):");
            }
            fruitbak[i] = fruit;
//            prijs = getPrice(fruit);
//            som += prijs;
        }
        return fruitbak;
    }

    public static double berekenTotaalFruitbakBTW(double mandTotaalPrijsExclusiefBTW){
        return mandTotaalPrijsExclusiefBTW * 0.21;
    }
    public static double berekenTotaalFruitbak(String[] fruitbak){
        double prijs;
        double som = 0;
        for (int i = 0; i < fruitbak.length; i++) {
            prijs = getPrice(fruitbak[i]);
            som += prijs;
        }
        return som;
    }
    public static int askInputInt(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
    public static double getPrice(String fruit){
        String[] opties_fruit= {"R","G","P"};
        Double[] prijzen_fruit= {1.0,0.5,1.5};
        double prijs = 0;
            for (int i = 0; i < opties_fruit.length; i++) {
                if (opties_fruit[i].equals(fruit)) {
                    prijs = prijzen_fruit[i];

                }
            }
        return prijs;
    }
    public static String askInputStr(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.next();
    }
    public static void print(String... args){
        // Ik heb een print statement gemaakt die werkt zoals die ene in Python3 :)
        String output = "";
        for (String arg: args) {
            output += " ";
            output += arg;
        }
        System.out.println(output);
    }
}

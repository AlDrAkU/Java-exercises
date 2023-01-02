package ExamenJavaFundamentals;

import java.util.Scanner;

public class GeschenkMand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welkom! we hebben enkele gegevens nodig.");
        System.out.println("Wat is je voornaam?");
        String voornaam = input.next();
        System.out.println("Wat is je Achternaam?");
        String achternaam = input.next();
        System.out.println("Straat?");
        String straat = input.next();
        System.out.println("Huisnummer?");
        int huisnummer = input.nextInt();
        System.out.println("Postcode");
        int postcode = input.nextInt();
        System.out.println("Stad");
        String stad = input.next();

        System.out.println("Hoe groot is je geschenkmand?");
        int lengteGeschenkmand = input.nextInt();
        while(lengteGeschenkmand < 2 || lengteGeschenkmand > 5)
        {
            System.out.println("Je hebt een ongeldige aantal ingegeven voor je geschenkmand, namelijk "+Integer.toString(lengteGeschenkmand)+" ,probeer opnieuw.");
            lengteGeschenkmand = input.nextInt();
        }
        String[] geschenkMand = new String[lengteGeschenkmand];
        vulMand(geschenkMand);
        String strMand = "";
        for (String s : geschenkMand) {
            strMand += s + " ";
            System.out.println(s);
        }
        System.out.println("Beste "+voornaam+" "+achternaam + " van "+ straat + " "+ huisnummer + " "+ postcode+" "+ stad+".");
        System.out.println(strMand);
        double totaalPrijsExclBTW = berekenTotaal(geschenkMand);
        System.out.println("De waarde van je maand is: "+totaalPrijsExclBTW + " Euro.");
        double totaalPrijsInclBTW = berekenTotaalBTW(totaalPrijsExclBTW);
        System.out.println("Inclusief BTW is dit: "+totaalPrijsInclBTW + " Euro.");
    }

    public static void vulMand(String[] geschenkMand) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < geschenkMand.length; i++) {
            System.out.println("Welke geschenken kies je? (keuze: C, S, F):");
            String geschenk = input.next().toLowerCase();

            while(!geschenk.equalsIgnoreCase("c")&& !geschenk.equalsIgnoreCase("s")&&!geschenk.equalsIgnoreCase("f"))
            {
                System.out.println("Je hebt een ongeldige keuze ingegeven, namelijk "+geschenk+",probeer opnieuw.");
                geschenk = input.next().toLowerCase();
            }
            geschenkMand[i] = geschenk;
        }

    }
    public static double berekenTotaal(String[] geschenkMand){
        double som = 0;
        for (String s : geschenkMand) {
            som += getPrice(s);
        }
        return som;
    }
    public static double berekenTotaalBTW(double prijs){

        return prijs *1.21;
    }

    public static double getPrice(String geschenk){
        String[] opties_geschenk= {"c","s","f"};
        Double[] prijzen_geschenk= {2.0,3.0,1.0};
        double prijs = 0;
        for (int i = 0; i < opties_geschenk.length; i++) {
            if (opties_geschenk[i].equals(geschenk)) {
                prijs = prijzen_geschenk[i];

            }
        }
        return prijs;
    }
}

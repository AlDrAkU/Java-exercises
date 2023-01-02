package ExamenJavaFundamentals;

import java.util.Scanner;

public class OpbrengstAkkerLandbouwer {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Geef de lengte van je akker: ");
        double lengte = input.nextDouble();
        while (lengte <= 0){
            System.out.println("Ongeldige getal voor de lengte van je akker, probeer opnieuw: ");
            lengte = input.nextDouble();
        }
        System.out.println("Geeft de breedte van je akker: ");
        double breedte = input.nextDouble();
        while (breedte <= 0){
            System.out.println("Ongeldige getal voor de breedte van je akker, probeer opnieuw: ");
            breedte = input.nextDouble();
        }
    double oppervlakte = lengte * breedte;
        System.out.println("De oppervlakte van de akker is "+oppervlakte+ " vierkante meter");
    double winstAardappel = BerekenWinstAardappel(oppervlakte);
        System.out.println("Een akker met aardappelen geeft volgende opbrengst: "+winstAardappel);
    double winstMais = BerekenWinstMais(oppervlakte);
        System.out.println("Een akker met mais geeft volgende opbrengst: "+winstMais);

    }
    public static double BerekenWinstAardappel(double oppervlakte){
        return oppervlakte * 2;
    }

    public static double BerekenWinstMais(double oppervlakte){
        return oppervlakte * 3;
    }
}

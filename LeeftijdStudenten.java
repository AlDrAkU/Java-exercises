import java.util.Scanner;

public class LeeftijdStudenten {
    public static void main(String[] args) {
        int[] arrayLeeftijden = leeftijdenOpvragen();
        double avg = berekenGemiddelde(arrayLeeftijden);
        System.out.printf("De gemiddelde leeftijd is: %.1f %n",avg);
    }

    private static int[] leeftijdenOpvragen() {
        Scanner input = new Scanner(System.in);
        System.out.println("Met hoeveel zijn jullie?");
        int aantal = input.nextInt();
        int[] arrayLeeftijden = new int[aantal];
        for (int i = 0; i < aantal; i++) {
            System.out.println("Student "+(i+1) +", Wat is jou leeftijd?");
            arrayLeeftijden[i] = input.nextInt();
        }
        return arrayLeeftijden;
    }


    public static double berekenGemiddelde(int[]leeftijden) {
        double som = 0;
        int aantal = leeftijden.length;
        for (int i = 0; i < aantal; i++) {
            som += leeftijden[i];
        }
        return som/aantal;
    }
}

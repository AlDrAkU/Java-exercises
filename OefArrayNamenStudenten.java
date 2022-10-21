import java.util.Scanner;

public class OefArrayNamenStudenten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hoeveel studenten zijn er?");
        int aantal = input.nextInt();
        String[] namenLeerlingen = new String[aantal];

        namenOpvragen(input, aantal, namenLeerlingen);

        namenPrinten(aantal, namenLeerlingen);
    }

    private static void namenOpvragen(Scanner input, int aantal, String[] namenLeerlingen) {
        for (int i = 0; i < aantal; i++) {
            System.out.println("Student "+(i+1) + " wat is je naam?");
            String naam = input.next();
            namenLeerlingen[i] = naam;
        }
    }

    private static void namenPrinten(int aantal, String[] namenLeerlingen) {
        System.out.println("In de lijst zijn de volgende studenten: ");
        for (int i = 0; i < aantal; i++) {
            System.out.println(namenLeerlingen[i]);
        }
    }
}

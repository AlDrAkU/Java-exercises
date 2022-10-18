import java.util.Scanner;

public class Kortingen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef je leeftijd:");
        int leeftijd = input.nextInt();
        double korting;

        if (leeftijd < 5) {
            korting = 1;
            System.out.println("De korting is: " + 100 * korting + "%");
        } else if (leeftijd < 18 && leeftijd > 5) {
            korting = 0.1;
            System.out.println("De korting is: " + 100 * korting + "%");
        } else if (leeftijd >= 65) {
            korting = 0.1;
            System.out.println("De korting is: " + 100 * korting + "%");
        }
        else {
            korting = 0;
            System.out.println("De korting is: " + 100 * korting + "%");
        }
    }
}

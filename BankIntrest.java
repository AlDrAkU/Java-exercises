import java.util.Scanner;

public class BankIntrest {
    // interest = saldo / 100 * 5
    public static void main(String[] args) {
        System.out.println("Hoeveel wil je beleggen?");
        Scanner input = new Scanner(System.in);
        double saldo = input.nextDouble();
        //BankIntrest bank = new BankIntrest();
        double intrest_pct = 5;
        //double interest = bank.BerekenInterest(saldo,intrest_pct);
        double interest = berekenInterest(saldo,intrest_pct);
        System.out.println("Jou intrest is : "+interest+ " €");

    }

    public static double berekenInterest(double geldsaldo, double interest) {

        return geldsaldo * (interest/100);

    }
}

package Oef3;

import java.util.Scanner;

public class Schikkeljaar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef het jaar in:");
        int jaar = input.nextInt();
        boolean schikkeljaar = false;

        if (jaar % 4 == 0) {
            if(jaar % 100 != 0 || (jaar % 400) == 0) {
                    schikkeljaar = true;
            }
        }

        if (schikkeljaar){
            System.out.println("Het jaar "+ jaar +" is een schikkeljaar en februari heeft 29 dagen.");
        }
        else{
            System.out.println("Het jaar "+ jaar +" is geen schikkeljaar en februari heeft 28 dagen.");
        }
    }
}

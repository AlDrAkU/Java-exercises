package Oef2;

import java.util.Scanner;

public class Machtsverheffing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Geef een getal in: ");
        int getal = input.nextInt();
        System.out.println("Geef een macht in: ");
        int macht = input.nextInt();
        Machtsverheffing m = new Machtsverheffing();
        int resultaat = m.Power(getal,macht);
        System.out.println("Resultaat : "+resultaat);

    }
    public int Power(int a,int b) {
        return (int)Math.pow(a,b);
    }
}

package Oef2;

import java.util.Scanner;

public class Hypotenusa {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Geef in de lengte zijde A:");
    double a = input.nextDouble();
        System.out.println("Geef in de lengte zijde B:");
    double b = input.nextDouble();
    Hypotenusa c = new Hypotenusa();

        System.out.println("Lengte Oef2.Hypotenusa: "+c.CalcHypo(a,b));

    }
    public double CalcHypo(double a, double b){

        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

}

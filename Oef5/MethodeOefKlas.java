package Oef5;

import java.util.Scanner;

public class MethodeOefKlas {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        double c = 5.2;
        double d = 6.5;

        //System.out.println(add(a,b));
        //System.out.println(add(c,d));
        //double prijs = askInput("Hoeveel is de prijs?" );
        //double btwPct = askInput("Wat is de btw pct? ");
        //System.out.println("De aantal is: "+aantal);
        //double btw = btwBerekenen(prijs,btwPct);
        //System.out.println("Prijs exclusief BTW: "+prijs);
        //System.out.println("BTW is: "+btw);
        //System.out.println("Prijs inclusief BTW: "+(prijs+btw));
        print("BLA","+");
        print("bla"+6,"BLABLA");

    }
    public static int add(int a, int b){

        return a+b;
    }
    public static double add(double a, double b){

        return a+b;
    }

    public static double askInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }

    public static void print(String... args){
        String output = "";
        for (String arg: args) {
            output += " ";
            output += arg;
        }
        System.out.println(output);
    }


    public static double btwBerekenen(double prijs, double pctBtw){
        return prijs*(pctBtw/100);
    }
}

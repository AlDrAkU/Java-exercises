package Oef2;

import java.util.Scanner;

public class Vermeningvuldiging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number:");
        int a = input.nextInt();
        System.out.println("Input second number:");
        int b = input.nextInt();
        Vermeningvuldiging v = new Vermeningvuldiging();
        System.out.println("Multiplying result is: "+ v.Multiply(a,b));
    }


    public int Multiply(int a,int b) {

        return a *b;
    }
}

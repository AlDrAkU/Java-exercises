package Oef2;

import java.util.Scanner;

public class Balk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hoogte:");
        double h = input.nextDouble();
        System.out.println("Breedte:");
        double b = input.nextDouble();
        System.out.println("Lengte");
        double l = input.nextDouble();

        Balk balk = new Balk();
        double volBalk = balk.CalculateVolume(l,b,h);
        double surfaceBalk = balk.CalculateSurface(l,b,h);

        System.out.println("Surface is: "+surfaceBalk+" cm^2");
        System.out.println("Volume is: "+volBalk+" cm^3");
    }
    public double CalculateVolume(double l,double b,double h){

        return l * b * h;
    }
    public double CalculateSurface(double l, double b, double h){
        return 2*(l*b) + 2*(b * h) + 2*(h * l);
    }
}

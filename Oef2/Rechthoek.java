package Oef2;

import java.util.Scanner;

public class Rechthoek {
    int breedte;
    int lengte;

    Scanner scan = new Scanner(System.in);
    public int Oppervlakte(){

        return this.breedte * this.lengte;
    }
    public int Omtrek(){
        return (this.breedte * 2) + (this.lengte * 2);
    }
    public static void main(String[] args) {
       Rechthoek r = new Rechthoek();
       System.out.println("Wat is de breedte?");
       r.breedte = r.scan.nextInt();
       System.out.println("Wat is de lengte?");
       r.lengte = r.scan.nextInt();
       int oppervlakte = r.Oppervlakte();
       System.out.println("Het oppervlakte is : "+oppervlakte);
       int omtrek = r.Omtrek();
       System.out.println("Het omtrek is : "+ omtrek);
    }
}

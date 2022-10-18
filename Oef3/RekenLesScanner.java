package Oef3;

import java.util.Scanner;

public class RekenLesScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef getal1:");
        double getal1 = input.nextDouble();
        System.out.println("Geeft getal2:");
        double getal2 = input.nextDouble();
        System.out.println("Welke operatie wil je doen? + - / * %");
        char operatie = input.next().charAt(0);
        double resultaat = 0;
        switch(operatie){
            case '+':
                resultaat = getal1+getal2;
                //System.out.println("resultaat is: "+resultaat);
                break;
            case '-':
                resultaat = getal1-getal2;
                //System.out.println("resultaat is: "+resultaat);
                break;
            case '/':
                if (getal2!=0) {
                    resultaat = getal1 / getal2;
                    //System.out.println("resultaat is: " + resultaat);
                    break;
                }
                else
                {
                    System.out.println("Kan niet delen door 0.");break;}


            case '*':
                resultaat = getal1*getal2;
                //System.out.println("resultaat is: "+resultaat);
                break;
            case '%':
                resultaat = getal1%getal2;
                //System.out.println("resultaat is: "+resultaat);
                break;
            case '^':
                resultaat = Math.pow(getal1,getal2);
                //System.out.println("resultaat is: "+resultaat);
                break;
            default:
                System.out.println("ongeldig char!");

        }

        System.out.println("resultaat is: "+resultaat);
    }
}

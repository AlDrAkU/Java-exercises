import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //String s = "Erasmus Hogeschool Brussel";
        char action;

        do {
/*        for (int i = 0; i <= s.length(); i++) {

            System.out.println(s.substring(0,i));
        }
    }

 */
        /*
        int i = 0;
        while (i<= s.length()){

            System.out.println(s.substring(0,i));
            i+=2;
        }
        System.out.println("out of the loop.");

    */
        /*
        int i = 0;
        do
        {
            System.out.println(s.substring(0,i));
            //System.out.println(i);
            i++;
        }
        while (i<=s.length());
*/
            Scanner input = new Scanner(System.in);
            System.out.println("Welke tafel will je leren: ");
            int getal = input.nextInt();

            for (int i = 0; i <= 10; i++) {

                System.out.println(i + " * " + getal + " = " + i * getal);

            }
            System.out.println("Do you want to continue? any key to continue, q to quit.");
            action = input.next().toLowerCase().charAt(0);
        }while (action != 'q');
    };



}

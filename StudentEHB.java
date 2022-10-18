import java.util.Scanner;

public class StudentEHB {
    String strVoornaam;
    String strFamilienaam;
    int intLeeftijd;

    public int setLeeftijd() {
        System.out.println("Wat is je leeftijd?");
        Scanner input = new Scanner(System.in);
        intLeeftijd = input.nextInt();
        return intLeeftijd;
    }

    public String setStrVoornaam() {
        System.out.println("Wat is je voornaam?");
        Scanner input = new Scanner(System.in);
        strVoornaam = input.nextLine();
        return strVoornaam;
    }
    public String setStrFamilienaam() {
        System.out.println("Wat is je familie naam?");
        Scanner input = new Scanner(System.in);
        strFamilienaam = input.nextLine();
        return strFamilienaam;
    }
    public static void main(String[] args) {
        StudentEHB student = new StudentEHB();
        //Scanner input = new Scanner(System.in);
        student.setStrVoornaam();
        //String strVoornaam = input.nextLine();
        student.setStrFamilienaam();
        //String strFamilienaam = input.nextLine();
        student.setLeeftijd();
        //int intLeeftijd = input.nextInt();
        System.out.println("Hallo "+student.strVoornaam +" " +student.strFamilienaam);
        System.out.println("Je bent "+student.intLeeftijd + " jaar oud.");


    }
}

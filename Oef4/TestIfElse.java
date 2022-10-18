package Oef4;


import java.util.Scanner;

public class TestIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een reel getal in:");
        double getal = input.nextDouble();
        String result = TestIfElse.translateValue(getal);
        System.out.println(result);

        System.out.println("Running Test translation.");
        testTranslate();

    }


    public static String translateValue(double value) {
        String translatedValue="";

        if (value < 50){
            translatedValue ="A";
        }else if (value>50.5 && value< 51) {
            translatedValue = "B";
        }else if (value>51 && value< 51.5) {
            translatedValue = "C";
        }else if (value>51.5 && value <52) {
            translatedValue = "D";
        }else if (value > 52) {
            translatedValue = "E";
        }
        else{
            System.out.println("Er is een gat in de translation tussen 50 en 50.5 inclusief deze 2 grenzen.");
        }
        return translatedValue;
    }
    public static void testTranslate(){
        double testVar1 = 49;
        double testVar2 = 50.6;
        double testVar3 = 51.1;
        double testVar4 = 51.6;
        double testVar5 = 52.1;

        String result1 = translateValue(testVar1);
        if (result1.equals("A")){
            System.out.println("test 1 correct.");
        }
        else {
            System.out.println("Error in test 1");
        };
        String result2 = translateValue(testVar2);
        if (result2.equals("B")){
            System.out.println("test 2 correct.");
        }
        else {
            System.out.println("Error in test 2");
        };
        String result3 = translateValue(testVar3);
        if (result3.equals("C")){
            System.out.println("test 3 correct.");
        }
        else {
            System.out.println("Error in test 3");
        };
        String result4 = translateValue(testVar4);
        if (result4.equals("D")){
            System.out.println("test 4 correct.");
        }
        else {
            System.out.println("Error in test 4");
        };
        String result5 = translateValue(testVar5);
        if (result5.equals("E")){
            System.out.println("test 5 correct.");
        }
        else {
            System.out.println("Error in test 5");
        };
    }
}

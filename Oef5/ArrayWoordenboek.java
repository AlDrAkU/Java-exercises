package Oef5;

import java.util.Scanner;

public class ArrayWoordenboek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String[] nl_woorden= {"appel","peer","pruim"};
    String[] fr_woorden= {"pomme","paire","prune"};

        char action;
        do {
            System.out.println("Naar welke taal wilt u vertalen?");
            String taal = input.next().toLowerCase();
            System.out.println("Welke woord?");
            String woord = input.next().toLowerCase();

            if (taal.equals("nl")) {
                translateWord(fr_woorden, nl_woorden, woord);
            }
            else if (taal.equals("fr")) {
                translateWord(nl_woorden,fr_woorden,woord);
            }
            System.out.println("Do you want to continue? any key to continue, q to quit.");
            action = input.next().toLowerCase().charAt(0);
        }while (action != 'q');
    }

    private static void translateWord(String[] from_language,String[] to_language, String woord) {
        for (int i = 0; i < from_language.length; i++) {
            if (from_language[i].equals(woord)) {
                String vertaling = to_language[i];
                System.out.println(vertaling);
            }
        }
    }

    ;
    }


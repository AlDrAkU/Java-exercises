import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
        public static void main(String[] args) {
            System.out.println("Welcome to rock, paper, scissors.");
            ArrayList<String> choices = new ArrayList<String>();
            choices.add("rock");
            choices.add("paper");
            choices.add("scissors");
            int score = 0;

            Random rdm = new Random();


            char action;

            do {
                Scanner input = new Scanner(System.in);

                int cpuChoice = rdm.nextInt(0,3);
                System.out.println(cpuChoice);
                String cpuPlay = choices.get(cpuChoice).toLowerCase();
                //System.out.println(cpuPlay);
                System.out.println("What do you choose?: ");
                String playerChoice = input.nextLine().toLowerCase();
                //System.out.println(playerChoice);
                if(playerChoice.equals(cpuPlay)){
                    System.out.println("Draw!");
                    System.out.println("You played: "+playerChoice+ " and cpu played: "+cpuPlay);
                }
                else if (playerChoice.equals("rock") && cpuPlay.equals("paper")) {
                    System.out.println("Loss!");
                    System.out.println("You played: "+playerChoice+ " and cpu played: "+cpuPlay);
                }
                else if (playerChoice.equals("rock") && cpuPlay.equals("scissors"))  {
                    System.out.println("Win!");
                    System.out.println("You played: "+playerChoice+ " and cpu played: "+cpuPlay);
                    score+=1;
                }
                else if (playerChoice.equals("paper") && cpuPlay.equals("scissors")) {
                System.out.println("Loss!");
                System.out.println("You played: "+playerChoice+ " and cpu played: "+cpuPlay);
                }
                else if (playerChoice.equals("paper") && cpuPlay.equals("rock"))  {
                System.out.println("Win!");
                System.out.println("You played: "+playerChoice+ " and cpu played: "+cpuPlay);
                score+=1;
                }
                else if (playerChoice.equals("scissors") && cpuPlay.equals("rock")) {
                    System.out.println("Loss!");
                    System.out.println("You played: "+playerChoice+ " and cpu played: "+cpuPlay);
                }
                else if (playerChoice.equals("scissors") && cpuPlay.equals("paper"))  {
                    System.out.println("Win!");
                    System.out.println("You played: "+playerChoice+ " and cpu played: "+cpuPlay);
                    score+=1;
                }
                System.out.println("Your score is: "+score);
                System.out.println("Do you want to continue? any key to continue, q to quit.");
                action = input.next().toLowerCase().charAt(0);
            }while (action != 'q');
        };
    }



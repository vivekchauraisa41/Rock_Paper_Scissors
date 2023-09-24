import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Random rand = new Random();
                Scanner sc = new Scanner(System.in);

                System.out.println("Press (R) for Rock, (P) for Paper and (S) for Scissor.");
                System.out.print("Enter - ");
                String s1;
                s1 = sc.next();

                if (s1.equalsIgnoreCase("R") || s1.equalsIgnoreCase("P") || s1.equalsIgnoreCase("S")) {

                    if (s1.equalsIgnoreCase("P")){
                        System.out.println("You Choose - Paper");
                    }
                    if (s1.equalsIgnoreCase("R")){
                        System.out.println("You Choose - Rock");
                    }
                    if (s1.equalsIgnoreCase("S")){
                        System.out.println("You Choose - Scissor");
                    }

                    int rnd1 = rand.nextInt(3);


                    if (rnd1 == 1){
                        System.out.println("Computer - Paper");
                    }
                    else if (rnd1 == 2){
                        System.out.println("Computer - Scissor");
                    }
                    else {
                        System.out.println("Computer - Rock");
                    }


                    if ((s1.equalsIgnoreCase("R") && rnd1 == 1) || (s1.equalsIgnoreCase("P") && rnd1 == 2) || (s1.equalsIgnoreCase("S") && rnd1 == 3)) {
                        System.out.println("You Lose! Try again...");
                    }
                    else if ((s1.equalsIgnoreCase("S") && rnd1 == 1) || (s1.equalsIgnoreCase("R") && rnd1 == 2) || (s1.equalsIgnoreCase("P") && rnd1 == 3)){
                        System.out.println("Congratulations! You Won");
                    }
                    else if ((s1.equalsIgnoreCase("P") && rnd1 == 1) || (s1.equalsIgnoreCase("S") && rnd1 == 2) || (s1.equalsIgnoreCase("R") && rnd1 == 3) ){
                        System.out.println("Match-Tied");
                    }
                }
                else {
                    System.out.println("ERROR - Please press (R), (P) or (S) only!");
                }
            }
        }
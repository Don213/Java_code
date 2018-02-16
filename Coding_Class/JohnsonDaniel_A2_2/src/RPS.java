////////////////////////////////
//
// Daniel Johnson
// Assignment 2.2
// 2/7/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program plays rock, paper, scissors with user and asks if they want to play again.
//
//
// INPUTS: This program asks the user to choose rock, paper, or scissor (As "R", "P", or "S") and stores their answer
// in the string variable called "answer".
//
//
// OUTPUTS: This program outputs the results of the glorious rock, paper, scissors battle between the user and the program.
// It displays what the computer played and who won.
//
//
//
////////////////////////////////




import java.util.Scanner;
import java.util.Random;


public class RPS {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in); //Creates scanner object

        Random random = new Random(); //Creates random object

        String catchMe = ""; //Variable used to check for unexpected input when asking to play again

        String playAgain; //Initializes a variable used to determine if the user wants to play again
        while (true) { //Infinite loop that only stops when the user enters "n" or "no" as their answer to play again

            System.out.println("Let\'s play rock, paper, scissors! Enter \"R\", \"P\", or \"S\" below:\n"); //Asks for input

            String answer = keyboard.nextLine().toLowerCase().trim();
            //Captures keyboard input and trims out spaces and makes all letters lowercase to make testing easier

            String compAnswer = "0"; //Initializes compAnswer


            String randomRPS = Integer.toString(random.nextInt(3) + 1);
            //Generates a random number from 0-2. includes 0 and 2. Does not go up to 3. Adds 1 to get up to 3.
            //The integer is also converted to string to make the switch statement comparison below easier.

            //Assigns values of rock, paper, or scissors to the random integers generated above.
            switch (randomRPS) {
                case "1":
                    compAnswer = "r";
                    break;
                case "2":
                    compAnswer = "p";
                    break;
                case "3":
                    compAnswer = "s";
                    break;
            }

            //System.out.println(compAnswer);

            if (answer.equals("r") && compAnswer.equals("r")) { //Rock ties rock
                System.out.println("The computer played rock!\nYou have tied with the computer.");
            } else if (answer.equals("r") && compAnswer.equals("p")) { //Rock loses to paper
                System.out.println("The computer played paper!\nSorry, you lost.");
            } else if (answer.equals("r") && compAnswer.equals("s")) { //Rock wins against scissors
                System.out.println("The computer played scissors!\nYou won!");
            } else if (answer.equals("p") && compAnswer.equals("p")) { //Paper ties paper
                System.out.println("The computer played paper!\nYou have tied with the computer.");
            } else if (answer.equals("p") && compAnswer.equals("s")) { //Paper loses to scissors
                System.out.println("The computer played scissors!\nSorry, you lost.");
            } else if (answer.equals("p") && compAnswer.equals("r")) { //Paper wins against rock
                System.out.println("The computer played rock!\nYou won!");
            } else if (answer.equals("s") && compAnswer.equals("s")) { //Scissors ties scissors
                System.out.println("The computer played scissors!\nYou have tied with the computer.");
            } else if (answer.equals("s") && compAnswer.equals("r")) { //Scissors loses against rock
                System.out.println("The computer played rock!\nSorry, you lost.");
            } else if (answer.equals("s") && compAnswer.equals("p")) { //Scissors wins against paper
                System.out.println("The computer played paper!\nYou won!");
            }

            else{System.out.println("There was unexpected input.");} //Catches unexpected input.

            System.out.println("\nWould you like to play again? Yes or No?"); //Asks for input


            do {//Makes sure the user decides to play again or not.
                playAgain = keyboard.nextLine().toLowerCase().trim();
                //Captures keyboard input and trims out spaces and makes all letters lowercase to make testing easier

                if (playAgain.equals("n") || playAgain.equals("no")) { //Checks to see if their answer was no
                    System.out.println("Thank you for playing!");
                    //catchMe = "n";
                    System.exit(0);
                }
                else if (playAgain.equals("y") || playAgain.equals("yes")){ //Checks to see if their answer was yes
                    catchMe = "n";
                }
                else{
                    catchMe = "caught"; //If the answer to play again wasn't yes or no, then it will ask again. (Check end of do-while loop)
                    System.out.println("There was an unexpected input; would you like to play again? Yes or No?");
                    }

                }while (catchMe.equals("caught")); //Since catchMe was set as "caught", the loop repeats while it checks for proper input again.

        }



        }

    }
//}

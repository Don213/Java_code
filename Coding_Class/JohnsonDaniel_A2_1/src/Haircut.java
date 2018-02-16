////////////////////////////////
//
// Daniel Johnson
// Assignment 2.1
// 2/7/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program has the user give answers to a quiz that determine which haircut they should get.
//
//
// INPUTS: This takes input for the following questions: "a)Male or b)Female" (Stored in a1), "a)Super Hero or b)Super Villain" (Stored in a2),
// "a)Steak or b)Sushi" if male (Stored in a3), and "a)Anime or b)Sitcom" if female (stored in a3).
//
//
//
// OUTPUTS: This program outputs an intro that tells the user they need a haircut and various questions that the user inputs answers for; then,
// the program outputs a suggested haircut after enough answers are collected from the user.
//
////////////////////////////////






import java.util.Scanner;



public class Haircut {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); //Creates a scanner object

        String errorMessage = "Please restart the program; there was an unexpected input."; //Stores an error message

        System.out.println("Your hair looks terrible! You need a haircut!"); //Insulting statements that persuades the user to get a haircut suggested by the computer
        System.out.println();
        System.out.println("Take my quiz to figure out what haircut you should get! Choose and type \"a\" or \"b\" as your answer."); //Tells the user to answer with "a" or "b"
        System.out.println();
        System.out.println("a)Male or b)Female"); //Ask the first question

        String q1 = keyboard.nextLine().toLowerCase().trim();
        //Takes the user's first answer as a string variable and makes it lowercase and trims spaces to prepare it for comparisons
        //THIS IS DONE FOR EVERY STRING INPUT BY THE USER AND WILL NOT BE EXPLAINED AGAIN.


        if (q1.equals("a")) {//Checks to see if user's first answer was "a"
            System.out.println("a)Super Hero or b)Super Villain"); //Asks second question
            String q2 = keyboard.nextLine().toLowerCase().trim(); //Takes the user's second input as a string variable

            if (q2.equals("b")) {//Checks to see if user's second answer was "b"
                System.out.println("You should get a mohawk!"); //Declares a suggested haircut
            }
            else if (q2.equals("a")){ //Checks to see if user's second answer was "a"
                System.out.println("a)Steak or b)Sushi"); //Asks third question
                String q3 = keyboard.nextLine().toLowerCase().trim(); //Takes the user's third input as a string variable

                if(q3.equals("a")) { //Checks to see if user's third answer was "a"
                    System.out.println("You should get a flat top!"); //Declares a suggested haircut
                }
                else if(q3.equals("b")){ //Checks to see if user's third answer was "b"
                    System.out.println("You should get a pompadour!"); //Declares a suggested haircut
                }
                else{System.out.println(errorMessage);} //If the input is not "a" or "b", then an error message will be displayed
            }
            else {System.out.println(errorMessage);} //If the input is not "a" or "b", then an error message will be displayed
        }

        else if (q1.equals("b")) { //Checks to see if user's first answer was "b"
            System.out.println("a)Super Hero or b)Super Villain"); //Asks second question
            String q2 = keyboard.nextLine().toLowerCase().trim(); //Takes the user's second input as a string variable

            if (q2.equals("b")) { //Checks to see if user's second answer was "b"
                System.out.println("You should get a mohawk!"); //Declares a suggested haircut
            }
            else if (q2.equals("a")){ //Checks to see if user's second answer was "a"
                System.out.println("a)Anime or b)Sitcom"); //Asks third question
                String q3 = keyboard.nextLine().toLowerCase().trim(); //Takes the user's third input as a string variable

                if(q3.equals("a")) { //Checks to see if user's third answer was "a"
                    System.out.println("You should get bangs!"); //Declares a suggested haircut
                }
                else if(q3.equals("b")){ //Checks to see if user's third answer was "b"
                    System.out.println("You should get a bob!"); //Declares a suggested haircut
                }
                else{System.out.println(errorMessage);} //If the input is not "a" or "b", then an error message will be displayed
            }
            else{System.out.println(errorMessage);} //If the input is not "a" or "b", then an error message will be displayed
        }
        else{System.out.println(errorMessage);} //If the input is not "a" or "b", then an error message will be displayed
    }
}

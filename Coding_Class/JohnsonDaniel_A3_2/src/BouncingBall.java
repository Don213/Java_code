////////////////////////////////
//
// Daniel Johnson
// Assignment 3.2
// 2/22/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program simulates the bouncing of a ball.
//
//
// INPUTS: The user MUST input a PROPER value for the initial velocity of the bouncing ball; it cannot be a string or number less than or equal to zero.
//
//
// OUTPUTS: This outputs the height of the ball at every second in time until the fifth bounce.
//
//
//
////////////////////////////////





import java.util.Scanner;

public class BouncingBall {


    public static void main(String[] args){

        Scanner keyboard  = new Scanner(System.in);

        System.out.println("It's time to play with the bouncing ball!");
        System.out.println("Please enter an initial velocity for the ball: ");//prompts user input

        //String velocity = keyboard.nextLine();//user input for demand above
        double velocity2 = -1;

        while(velocity2 <= 0) {
            //Used "https://stackoverflow.com/questions/20546204/reject-non-numeric-characters" as a reference to learn how to use the try and catch in order to prevent non-number input.
            try{
                String velocity = keyboard.nextLine();//user input for demand above
                velocity2 = Integer.parseInt(velocity);//Tries to convert the string into a integer that gets cast to a double

                if (velocity2 < 0 || velocity2 == 0){System.out.println("Please enter a number that is not negative or zero");}//Prompts user for more input if they entered 0 or less than 0

            } catch(java.lang.NumberFormatException e){//This is the exception thrown when converting to a integer from a string and you cannot
                System.out.println("That was not a number; please enter input again.");//prompts user for input if they entered something that is not a number
            }
        }





        double height = 0; //counter for height
        double gravity = 32; //The force of gravity
        int bounce = 1; //counter for bounces
        int time = 0; //counter for time

        while(bounce <= 5){//ends the simulation when bounce hits 5

            //Simulates and checks for the bounce//
            if (height < 0){
                System.out.println("Bounce " + bounce);
                //Helps simulate the ball hitting the ground and losing velocity//
                height = height * -0.5;
                velocity2 = velocity2 * -0.5;
                velocity2 = velocity2 - gravity * 1.5;
                //Helps simulate the ball hitting the ground and losing velocity//

                bounce++; //increases to tell which bounce it is
            //Simulates and checks for the bounce//
            }
            else{
                System.out.println("Time: " + time + " Height: " + height);
                height = height + velocity2; //Adds the current velocity to the height to tell where the ball is.
                velocity2 = velocity2 - gravity; //Subtracts the downward force of gravity


            }

            time++; //increases time to tell the time
        }





















    }
}

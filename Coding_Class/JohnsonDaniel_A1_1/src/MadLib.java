////////////////////////////////
//
// Daniel Johnson
// Assignment 1.1
// 2/1/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This Program uses user input to create a mad lib out of their answers.
// There are two optional outputs for the mad lib. One option is the given mad lib for the assignment
// and the other is a custom one. You also have an option of both being displayed.
//
//
// INPUTS: This takes inputs from the user stored in the following variables: friendRelative, petAge, color, animal, disgustingFood, and choice.
//
//
// OUTPUTS: This program outputs a mad lib created by user input and stored strings.
//
////////////////////////////////



import java.util.Scanner;
//This program creates a mad lib out of the first name of a friend or relative, the age of a pet, a color, and animal, and a disgusting food.


public class MadLib {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //asks for string input that gets assigned to friendRelative
        System.out.println("Please enter first name of a friend or relative:");
        String friendRelative = keyboard.next();
        //

        //asks for an integer input that gets assigned to petAge
        System.out.println("Please enter the age of a pet:");
        Integer petAge = keyboard.nextInt();
        //

        //asks for string input that gets assigned to color
        System.out.println("Please enter a color:");
        String color = keyboard.next();
        //

        //asks for string input that gets assigned to animal
        System.out.println("Please enter a animal:");
        String animal = keyboard.next();
        //

        //asks for string input that gets assigned to disgustingFood
        System.out.println("Please enter a disgusting food:");
        String disgustingFood = keyboard.next();
        //

        System.out.println("Would you like the given mad lib or a custom one? Enter \"Given\", \"Custom\", or \"Both\"");
        String choice = keyboard.next();





        if (choice.equals("Custom")) {
            //Tells you your mad lib is below and concatenates a string below with all of the user input.
            System.out.println("This is your mad lib:");
            System.out.println("A nobel monk saw the future and told me that " + friendRelative + " ate " + petAge + " bananas because he was trying to save his dad from becoming a " + color + " " + animal + " that eats" + " " + disgustingFood + ".");
            //
        } else if (choice.equals("Given")) {
            //Tells you your mad lib is below and concatenates a string below with all of the user input.
            System.out.println("This is your mad lib:");
            System.out.println(friendRelative + " once said, \"My " + petAge + "-year old " + color + " " + animal + " just ate my homework and it tasted like " + disgustingFood + ". Yuck!");
            //
        } else if (choice.equals("Both")) {
            //Tells you your mad lib is below and concatenates a string below with all of the user input.
            System.out.println("This is your first mad lib:");
            System.out.println(friendRelative + " once said, \"My " + petAge + "-year old " + color + " " + animal + " just ate my homework and it tasted like " + disgustingFood + ". Yuck!");

            //
            System.out.println(); //Spaces out the mad libs
            //

            //Tells you your mad lib is below and concatenates a string below with all of the user input.
            System.out.println("This is your second mad lib:");
            System.out.println("A nobel monk saw the future and told me that " + friendRelative + " ate " + petAge + " bananas because he was trying to save his dad from becoming a " + color + " " + animal + " that eats" + " " + disgustingFood + ".");
            //
        }
        else {System.out.println("Your answer wasn't expected. Restart the program and try again"); }
    }
}

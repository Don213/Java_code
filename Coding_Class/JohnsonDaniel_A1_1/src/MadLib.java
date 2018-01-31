import java.util.Scanner;
//This program creates a mad lib out of the first name of a friend or relative, the age of a pet, a color, and animal, and a disgusting food.


public class MadLib {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        //asks for string input that gets assigned to friendRelative
        System.out.println("Please enter first name of a friend or relative");
        String friendRelative  = keyboard.next();
        //

        //asks for an integer input that gets assigned to petAge
        System.out.println("Please enter the age of a pet.");
        Integer petAge = keyboard.nextInt();
        //

        //asks for string input that gets assigned to color
        System.out.println("Please enter a color.");
        String color = keyboard.next();
        //

        //asks for string input that gets assigned to animal
        System.out.println("Please enter a animal.");
        String animal = keyboard.next();
        //

        //asks for string input that gets assigned to disgustingFood
        System.out.println("Please enter a disgusting food");
        String disgustingFood = keyboard.next();
        //

        //Tells you your mad lib is below and concatenates a string below with all of the user input.
        System.out.println("This is your mad lib:");
        System.out.println("A nobel monk saw the future and told me that " + friendRelative + " ate " + petAge + " bananas because he was trying to save his dad from becoming a " + animal + " that eats " + color + " " + disgustingFood + ".");
        //
    }
}

import java.util.Scanner;



public class MadLib {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter first name of a friend or relative");

        String friendRelative  = keyboard.next();

        System.out.println("Please enter the age of a pet.");

        Integer petAge = keyboard.nextInt();

        System.out.println("Please enter a color.");

        String color = keyboard.next();

        System.out.println("Please enter a animal.");

        String animal = keyboard.next();

        System.out.println("Please enter a disgusting food");

        String disgustingFood = keyboard.next();

        System.out.println("This is your mad lib:");
        System.out.println("A nobel monk saw the future and told me that " + friendRelative + " ate " + petAge + " bananas because he was trying to save his dad from becoming a " + animal + " that eats " + color + " " + disgustingFood + ".");

    }
}

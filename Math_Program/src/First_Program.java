import java.util.Scanner;


public class First_Program {
    public static void main(String[] args){
        System.out.println("Daniel Johnson is my programmer.");
        System.out.println("What would you like to do?: Add, Subtract, or Multiply?");
        Scanner keyboard = new Scanner(System.in);
        String Answer = keyboard.next();

        if (Answer.equals("Add")){
            System.out.println("Enter two integers.");
            int A1 = keyboard.nextInt();
            int A2 = keyboard.nextInt();
            System.out.println(A1+A2);
        }
        else if (Answer.equals("Subtract")) {
            System.out.println("Enter two numbers.");
            int A1 = keyboard.nextInt();
            int A2 = keyboard.nextInt();
            System.out.println(A1-A2);
        }
        else if (Answer.equals("Multiply")) {
            System.out.println("Enter two numbers.");
            int A1 = keyboard.nextInt();
            int A2 = keyboard.nextInt();
            System.out.println("Your new number is:" + A1*A2);
        }

        else {System.out.println("Please enter a correct option");}

    }

}

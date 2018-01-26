import java.util.Scanner;

/*
public class JohnsonDaniel_Lab01 {
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter a temperature in degrees fahrenheit: ");

    Integer DegreeF = keyboard.nextInt();



    }
}
*/

public class JohnsonDaniel_Lab01{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
//Creates a scanner object.

        System.out.print("Please enter a fahrenheit value to be converted to celsius: ");
//Prints out a string without a new line.

        Integer fahrenheit = keyboard.nextInt();
//Reads next integer input.


        //Integer celsius = (fahrenheit - 32) * (5 / 9);
//This line is wrong because it multiplies the expression by 0. 5/9 in JAVA's integer division is 0. This is why the bottom one is correct.

        Integer celsius = 5 * (fahrenheit - 32) / 9; //Conversion from fahrenheit to celsius.
//This line is right because it subtracts 32 first and multiplies by 5, allowing it to gain more value before being divided.
        System.out.println(celsius); //Prints out celsius conversion.
    }
}
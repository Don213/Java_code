////////////////////////////////
//
// Daniel Johnson
// Assignment 1.2
// 2/1/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program translates a binary number into a integer
//
//
// INPUTS: This takes in a 4 digit binary number from the user.
//
//
// OUTPUTS: This program outputs an integer translated from a binary number.
//
////////////////////////////////





import java.util.Scanner;


public class Binary_To_Decimal {


    public static void main(String[] args){

        //Creates new scanner object
        Scanner keyboard = new Scanner(System.in);

        //Asks for input of a four digit binary number that gets assigned to a string variable using the keyboard.next listener
        System.out.print("Please enter a 4 digit binary number: ");
        String binaryDigit  = keyboard.next();
        //

        //Reads the individual characters from strings and converts them to integers of 1 and 0 by subtracting 48.
        //After converting the characters to 1 and 0, it multiplies them by powers of two to finish the conversion into an integer from a binary number.
        int bd1 = (binaryDigit.charAt(0) - 48)*8;
        int bd2 = (binaryDigit.charAt(1) - 48)*4;
        int bd3 = (binaryDigit.charAt(2) - 48)*2;
        int bd4 = (binaryDigit.charAt(3) - 48);


        //Adds all the converted numbers together to get the final value.
        int finalV = bd1 + bd2 + bd3 + bd4;

        //Prints the final value.
        System.out.println(finalV);


    }


}

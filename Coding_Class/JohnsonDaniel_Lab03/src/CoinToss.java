////////////////////////////////////////////////////////////////////////////
//
//	Daniel Johnson
// 	Lab 3 Exercise
//	February 9, 2018
//
////////////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// 	DESCRIPTION:	This program does the following:
//                      1. Prompts the user to enter the results of eight coin tosses.
//                      2. Counts the number of heads and the number of tails.
//                      3. Displays the total number of heads and the total number of tails.
//                      4. Calculates and displays the percentages of heads and tails.
//
//
//	INPUTS:		Interactively reads a single char value for each of the eight coin tosses.
//                      'h' represents heads and 't' represents tails.
//
//	OUTPUTS:	The total number of heads, the total number of tails, and the percentage of
//                      heads and tails are displayed to the screen.
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class CoinToss {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String response;
        char tossResults;
        int headCount = 0, //Must initialize to 0 to ensure correct results
                tailCount = 0;

        int i = 0;

        String dv = "n";
        System.out.println("\n\nEnter either h for heads or t for tails");
        System.out.println("for eight coin tosses:\n");

        while (headCount + tailCount < 8) {


                System.out.println("Toss " + i + ":");

            /*
            switch (headCount + tailCount) {
                case 0:
                    System.out.print("First toss: ");
                    break;
                case 1:
                    System.out.print("Second toss: ");
                    break;
                case 2:
                    System.out.print("Third toss: ");
                    break;
                case 3:
                    System.out.print("Fourth toss: ");
                    break;
                case 4:
                    System.out.print("Fifth toss: ");
                    break;
                case 5:
                    System.out.print("Sixth toss: ");
                    break;
                case 6:
                    System.out.print("Seventh toss: ");
                    break;
                case 7:
                    System.out.print("Eighth toss: ");
                    break;
            }
*/
            do {
                response = keyboard.nextLine();
                tossResults = response.charAt(0);


                if (tossResults == 'h') {
                    headCount++;
                    i++;
                    dv = "y";
                } else if (tossResults == 't') {
                    tailCount++;
                    i++;
                    dv = "y";
                } else {
                    System.out.println("There was unexpected input; please re-enter your answer");
                    dv = "n";
                }
            }while(dv.equals("n"));
        }

            System.out.println("\nNumber of heads: " + headCount);
            System.out.println("Number of tails: " + tailCount);

            float percentHeads = ((float) headCount / 8) * 100;
            System.out.println("Percent heads: " + percentHeads + '%');

            float percentTails = ((float) tailCount / 8) * 100;
            System.out.println("Percent tails: " + percentTails + "%\n");

        }
    }

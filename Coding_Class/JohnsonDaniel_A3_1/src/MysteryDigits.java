////////////////////////////////
//
// Daniel Johnson
// Assignment 3.1
// 2/22/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program finds the mystery address that Riddler is planning his next caper at using the following conditions for the address number:
//
//
//
//1. All four digits are different
//2. The digit in the thousands place is three times the digit in the tens place
//3. The number is odd
//4. The sum of the digits is 27
//
//
// INPUTS: There is no user input for this program
//
//
// OUTPUTS: This program outputs the address of the next Riddler caper.
//
//
//
////////////////////////////////



public class MysteryDigits {

    public static void main(String[] args) {

                int c1;
                int c2;
                int c3;
                int c4;
                int mysteryNumber01 = 1001;

        String mysteryNumber02;



        while(mysteryNumber01 < 10000) {//Placeholder condition that could also be set to true to loop through many numbers until the right one was picked
            mysteryNumber02 = Integer.toString(mysteryNumber01);

            //parses out the individual numbers from the larger number
            c1 = Integer.parseInt(mysteryNumber02.substring(0, 1));
            c2 = Integer.parseInt(mysteryNumber02.substring(1, 2));
            c3 = Integer.parseInt(mysteryNumber02.substring(2, 3));
            c4 = Integer.parseInt(mysteryNumber02.substring(3, 4));



            if ((c1 != c2) && (c1 != c3) && (c1 != c4) && (c2 != c3) && (c2 != c4) && (c3 != c4) && ((c1*3) == c3) && ((c1 + c2 + c3 + c4) == 27)){
                //Goes through all the conditions need for the Joker's address


                //Outputs the address of the caper
                System.out.println("The Riddler plans to strike at " + mysteryNumber01 + " Lake Otis Parkway!");
                System.out.println("Hurry up before he makes his next move!");
                System.exit(0);
            }
            else{//increases number if it is not correct (starts on an odd number and increases by 2 every time to keep it odd because it was a condition
                mysteryNumber01 = mysteryNumber01 + 2;

            }
        }
    }
}


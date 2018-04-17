////////////////////////////////
//
// Daniel Johnson
// Assignment 8.2
// 4/10/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program and simulates a completely random dice roll and a loaded dice roll (where 50% of the rolls
// the highest number and 50% are any number lower than the highest)
//
//
// INPUTS: There is no input
//
//
// OUTPUTS: This outputs the ratios for the simulated dice rolls
//
//
//
////////////////////////////////



import java.util.Random;

public class LoadedDice extends Random {

    private LoadedDice() {super();}//loaded dice default constructor



    public int nextInt(int num) {
        int tempInt = super.nextInt(2);
        if (tempInt == 0) {
            return (num - 1);
        } else {
            return (super.nextInt((num - 1)));
        }
    }


    /*****************************************************************
     *
     * Name: nextInt()
     * Description: This creates a 50% chance to create the largest value in a given range and 50% chance to create any of the any lower values (Overload of Random nextInt())
     * Inputs: This takes an integer as input for the range of numbers it uses
     * Returned value: This returns a random value for a given range (50% highest number; 50% any other lower number)
     * Preconditions: none
     *
     *****************************************************************/





    public static void printDiceRolls(Random randGenerator) {
        for (int i = 0; i < 100; i++) {
            System.out.print(randGenerator.nextInt(6) + 1);
        }
        System.out.println();
    }


    //not used
    /*****************************************************************
     *
     * Name: printDiceRolls()
     * Description: Simulates and prints the results of 100 random dice rolls
     * Inputs: This takes a Random Object as input
     * Returned value: This returns no values
     * Preconditions: none
     *
     *****************************************************************/






    public static void tenThousandDiceRollsSimulation(Random randGenerator) {

        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int i = 0; i < 10000; i++) {



            int tempNum = (randGenerator.nextInt(6) + 1);
            switch (tempNum) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
            }
        }

        double onePercent = ((one/10000.0)*100.0);
        double twoPercent = ((two/10000.0)*100.0);
        double threePercent = ((three/10000.0)*100.0);
        double fourPercent = ((four/10000.0)*100.0);
        double fivePercent = ((five/10000.0)*100.0);
        double sixPercent = ((six/10000.0)*100.0);



        System.out.printf("The percentage for 1s is: " + "%.2f", onePercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("The percentage for 2s is: " + "%.2f", twoPercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("The percentage for 3s is: " + "%.2f", threePercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("The percentage for 4s is: " + "%.2f", fourPercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("The percentage for 5s is: " + "%.2f", fivePercent);
        System.out.print("%");
        System.out.println();
        System.out.printf("The percentage for 6s is: " + "%.2f", sixPercent);
        System.out.print("%");







    }

    /*****************************************************************
     *
     * Name: tenThousandDiceRollsSimulation()
     * Description: Simulates and prints the results of 10,000 dice rolls
     * Inputs: Takes a Random object as input
     * Returned value: This returns no values
     * Preconditions: none
     *
     *****************************************************************/





    public static void main(String[] args) {
        LoadedDice myDice = new LoadedDice();
        //printDiceRolls(myDice);



        System.out.println();//Space
        System.out.println("Loaded Dice percentages:");
        tenThousandDiceRollsSimulation(myDice);//uses regular Random class object
        System.out.println();//Space
        System.out.println();//Space
        System.out.println("Regular Random percentages:");
        tenThousandDiceRollsSimulation((new Random()));//Uses Loaded Dice extending Random Class object
        System.out.println();//Space
    }


}


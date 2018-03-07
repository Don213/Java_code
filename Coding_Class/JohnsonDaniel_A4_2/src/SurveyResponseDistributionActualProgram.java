////////////////////////////////
//
// Daniel Johnson
// Assignment 4.2
// 3/1/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program takes in the number of those in favor, against, and undecided for a (income) tax vote taken
// in class and gives you their percentages and a chart for visualization.
//
//
//
// INPUTS: This program takes a integer input for those in favor, against, and undecided towards a new tax in Alaska.
//
//
// OUTPUTS: This program outputs the votes that you entered, their percentages, and a chart that shows their percentages.
//
//
//
////////////////////////////////








import java.util.Scanner; //imports Scanner




public class SurveyResponseDistributionActualProgram {

public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in); //new scanner object for keyboard input

    SurveyResponse prgClass = new SurveyResponse(); //new survey response object

    System.out.println("Please enter the number of responses in favor of the income tax: "); //asks for input

    prgClass.setFavor(keyboard.nextInt()); //sets the amount for those in favor of tax

    System.out.println("Please enter the number of responses against the income tax: "); //asks for input

    prgClass.setAgainst(keyboard.nextInt()); //sets the amount for those against the tax

    System.out.println("Please enter the number of responses that were undecided towards the tax: "); //asks for input

    prgClass.setUndecided(keyboard.nextInt()); //sets the amount for those undecided

    System.out.println("You entered " + prgClass.getFavor() + " in favor, " + prgClass.getAgainst() + " against, and " + prgClass.getUndecided() + " as undecided."); //tells what was entered



    prgClass.getTotalResponses(); //displays the total responses for the survey

    prgClass.getPercentageFavor(); //displays the percentage of favor
    prgClass.getPercentageAgainst(); //displays the percentage of against
    prgClass.getPercentageUndecided(); //displays the percentage of undecided



    System.out.println();//spaces out the chart from the other print statements
    prgClass.percentChart(); //displays a chart for the responses
}








}





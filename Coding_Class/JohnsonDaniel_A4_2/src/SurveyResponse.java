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











import java.util.Scanner;

public class SurveyResponse {


Scanner keyboard = new Scanner(System.in);


    private int favor; //creates private class int

    private int against; //creates private class int

    private int undecided; //creates private class int

    public int getFavor(){return favor;} //a method for returning a private variable favor
    public int getAgainst(){return against;} //a method for returning a private variable against
    public int getUndecided(){return undecided;} //a method for returning a private variable undecided


    public void setFavor(int favor){ this.favor = favor; } //a method for setting a private variable favor
    public void setAgainst(int against){ this.against = against; } //a method for setting a private variable against
    public void setUndecided(int undecided){ this.undecided = undecided; } //a method for setting a private variable undecided


    public void getTotalResponses(){ System.out.println("There were " + (favor + against + undecided) +" votes total."); } //a method for printing the total votes


    public void getPercentageFavor(){//gets percentage for those in favor
        int totalVotes = (favor + against + undecided);
        System.out.println("Percentage for those in favor: " + Math.round(((favor*1.0)/totalVotes)*100) +"%");
    }

    public void getPercentageAgainst(){//gets percent for those against
        int totalVotes = (favor + against + undecided);
        System.out.println("Percentage for those in against: " + Math.round(((against*1.0)/totalVotes)*100) +"%");;
    }

    public void getPercentageUndecided(){//gets percent for those undecided
        int totalVotes = (favor + against + undecided);
        System.out.println("Percentage for those in undecided: " + Math.round(((undecided*1.0)/totalVotes)*100) +"%");
    }



    public void percentChart(){

        int totalVotes = (favor + against + undecided); //adds all votes
        int favorC = (int)(Math.round(((favor*1.0)/totalVotes)*100)/2); //divides to print out asterisks that represent 2% each later
        int againstC = (int)(Math.round(((against*1.0)/totalVotes)*100)/2); //divides to print out asterisks that represent 2% each later
        int undecidedC = (int)(Math.round(((undecided*1.0)/totalVotes)*100)/2); //divides to print out asterisks that represent 2% each later



        System.out.println("0%   10%  20%  30%  40%  50%  60%  70%  80%  90%  100%");
        System.out.println("|    |    |    |    |    |    |    |    |    |    |");
        System.out.println("***************************************************");

        for (int i = 0; i <= favorC; i++){//prints out an asterisk for each 2 percent in favor
            System.out.print("*");
        }
        System.out.print(" For\n");

        for (int i = 0; i <= againstC; i++){//prints out an asterisk for each 2 percent in against
            System.out.print("*");
        }
        System.out.print(" Against\n");

        for (int i = 0; i <= undecidedC; i++){//prints out an asterisk for each 2 percent in undecided
            System.out.print("*");
        }
        System.out.print(" Undecided");



    }


}

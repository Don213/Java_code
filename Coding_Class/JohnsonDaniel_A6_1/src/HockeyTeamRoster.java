////////////////////////////////
//
// Daniel Johnson
// Assignment 6
// 3/20/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION:
//
//
// INPUTS:
//
//
// OUTPUTS:
//
//
//
////////////////////////////////





import java.util.Scanner;

public class HockeyTeamRoster {




    private static final int NUM_JERSEY = 5;

    private int[] jerseyNumberA = new int[NUM_JERSEY];

    private int[] ratingA = new int[NUM_JERSEY];





    public HockeyTeamRoster(){

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Please enter the information for the next five players.");

        for (int i = 0; i < jerseyNumberA.length; i++) {

            System.out.print("Please enter the player's jersey number (0-99): ");

            jerseyNumberA[i] = keyboard.nextInt();

            System.out.println();

            System.out.print("Please enter player " + jerseyNumberA[i] + "'s rating (1-9): ");

            ratingA[i] = keyboard.nextInt();

            System.out.println();
        }
    }

    /*****************************************************************
     *
     * Name: HockeyTeamRoster
     * Description: This is a constructor method that sets up a new HockeyTeamRoster object.
     * Inputs: This takes integer input for each jersey number and rating for the players.
     * Returned value: Does not return a value
     * Preconditions: None
     *
     *****************************************************************/



    private int findInArray(int[] arrayTemp, int tempNum){

        int tempVariable = 0;

        for(int i = 0; i <arrayTemp.length; i ++){

            if(arrayTemp[i] == tempNum){
                tempVariable = i;
                break;
            }
            else if(i == (arrayTemp.length - 1)){
                System.out.println("There is no one with jersey number " + tempNum);
                tempVariable = -1;
            }

        }

        return tempVariable;
    }

    /*****************************************************************
     *
     * Name: findInArray
     * Description: This returns where the number is in the index
     * Inputs: This takes an array and a number to find as input
     * Returned value: This returns the index of where a number given is.
     * Preconditions: None
     *
     *****************************************************************/



    public void printRoster(){
        System.out.println("Roster");
        for (int i = 0; i < ratingA.length; i++) {
            System.out.println("Player " + (i+1) + " -- Jersey Number: " + jerseyNumberA[i] + ", Rating: " + ratingA[i]);
            }

            this.menu();
    }

    /*****************************************************************
     *
     * Name: printRoster
     * Description: This method prints the team roster
     * Inputs: This does not take input
     * Returned value: Does not return a value
     * Preconditions: None
     *
     *****************************************************************/

    public void updatePlayerRating(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Which player's jersey do you want to update? Enter their Jersey number.");
        int jerseyNumUpdate = keyboard.nextInt();


        int arrayIndex = findInArray(jerseyNumberA, jerseyNumUpdate);

        if(arrayIndex >= 0){
            System.out.println("Please enter the new rating for that player:");
            int newRating = keyboard.nextInt();

            ratingA[arrayIndex] = newRating;

            System.out.println("Rating Successfully updated.");
        }
        else{System.out.println("Rating not updated");}

        this.menu();
    }


    /*****************************************************************
     *
     * Name: updatePlayerRating
     * Description: This method updates a player's rating from rating array
     * Inputs: This takes a jersey number to find the array index and a new rating to set the rating after finding where the old one was.
     * Returned value: Does not return a value
     * Preconditions: None
     *
     *****************************************************************/

    public void outputAboveRating(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the rating you want the list of players to be above");

        int tempInt = keyboard.nextInt();

        System.out.println("ABOVE " + tempInt + ":");
        for (int i = 0; i < ratingA.length; i++){

            if(ratingA[i] > tempInt){
                System.out.println("Player with jersey number " + jerseyNumberA[i] + " has a rating of " +  ratingA[i]);
            }
        }
        this.menu();
    }



    /*****************************************************************
     *
     * Name: outputAboveRating.
     * Description: This method outputs players with a rating above a certain rating.
     * Inputs: This takes integer input to determine if ratings are above the number.
     * Returned value: This returns a list of players that are higher than the input number.
     * Preconditions: None
     *
     *****************************************************************/

    public void replacePlayer(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the jersey number of who you want to replace:");

        int replacementPlayer = keyboard.nextInt();

        int indexNum = findInArray(jerseyNumberA, replacementPlayer);

        if (indexNum >= 0) {

            System.out.println("Please enter the new jersey number of the player: ");

            jerseyNumberA[indexNum] = keyboard.nextInt();

            System.out.println("Please enter the rating for this new player: ");

            ratingA[indexNum] = keyboard.nextInt();

            System.out.println("Player updated");

            this.menu();
        }
        else{
            System.out.println("Player not updated.");
        }

    }


    /*****************************************************************
     *
     * Name: replacePlayer
     * Description: This method replaces the jersey number and rating for a certain player
     * Inputs: This takes integer input of a jersey number to determine which player must be replaced
     * Returned value: Does not return a value
     * Preconditions: None
     *
     *****************************************************************/




    public void menu(){
        System.out.println();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("MENU");

        System.out.println("U - Update Player Rating");

        System.out.println("A - Output Players Above A Certain Rating");

        System.out.println("R - Replace Player");

        System.out.println("O - Output Roster");

        System.out.println("Q - Quit");

        String tempString = keyboard.next();


        if(tempString.toLowerCase().equals("u")){
            System.out.println();
            updatePlayerRating();
        }
        else if(tempString.toLowerCase().equals("a")){
            System.out.println();
            outputAboveRating();
        }
        else if(tempString.toLowerCase().equals("r")){
            System.out.println();
            replacePlayer();
        }
        else if(tempString.toLowerCase().equals("o")){
            System.out.println();
            printRoster();
        }
        else if(tempString.toLowerCase().equals("q")){
            System.out.println();
            System.exit(0);
        }


    }


    /*****************************************************************
     *
     * Name: menu
     * Description: This method prints a menu for the user to navigate through.
     * Inputs: This takes a string letter as input to choose one of the options on the menu
     * Returned value: This does not return values but can output various items depending on the chosen option in the menu
     * Preconditions: None
     *
     *****************************************************************/










}

import javax.print.attribute.standard.NumberUp;
import java.util.Scanner;

public class HockeyTeamRoster {




    private static final int NUM_JERSEY = 5;

    private int[] jerseyNumberA = new int[NUM_JERSEY];

    private int[] ratingA = new int[NUM_JERSEY];



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




    public HockeyTeamRoster(){

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Please enter the information for the next five players.");

        for (int i = 0; i < jerseyNumberA.length; i++) {

            System.out.print("Please enter the player's jersey number: ");

            jerseyNumberA[i] = keyboard.nextInt();

            System.out.println();

            System.out.print("Please enter player " + jerseyNumberA[i] + "'s rating: ");

            ratingA[i] = keyboard.nextInt();

            System.out.println();
            }
    }


    /*
    public int[] getJerseyNumbers() {
        return jerseyNumberA;
    }

    public int[] getRatingA() {
        return ratingA;
    }

    public void printJerseyNumbers(){
        for (int i = 0; i < jerseyNumberA.length; i ++) {
            System.out.println(jerseyNumberA[i]);
        }
    }

    public void printRatingNumbers() {
        for (int i = 0; i < ratingA.length; i++) {
            System.out.println(ratingA[i]);
        }
    }
    */


    public void printRoster(){
        System.out.println("Roster");
        for (int i = 0; i < ratingA.length; i++) {
            System.out.println("Player " + (i+1) + " -- Jersey Number: " + jerseyNumberA[i] + ", Rating: " + ratingA[i]);
            }

            this.menu();
    }

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










}

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;



public class PopularityContestGame {


    private String rank;
    private String name;
    private String birth;



    private void setRank(String rank){this.rank = rank;}

    /*****************************************************************
     *
     * Name: setRank()
     * Description: This sets the rank variable
     * Inputs: This takes an string as input to set the rank
     * Returned value: This does not return any values
     * Preconditions: None
     *
     *****************************************************************/

    private void setName(String name){this.name = name;}

    /*****************************************************************
     *
     * Name: setName()
     * Description: This sets the name variable
     * Inputs: This takes an string as input to set the name
     * Returned value: This does not return any values
     * Preconditions: None
     *
     *****************************************************************/

    private void setBirth(String birth){this.birth = birth;}

    /*****************************************************************
     *
     * Name: setBirth()
     * Description: This sets the birth variable
     * Inputs: This takes an string as input to set the birth
     * Returned value: This does not return any values
     * Preconditions: None
     *
     *****************************************************************/

    public String getRank(){return rank;}

    /*****************************************************************
     *
     * Name: getRank()
     * Description: This returns the rank variable
     * Inputs: This does not take input
     * Returned value: This returns the value from the rank variable
     * Preconditions: None
     *
     *****************************************************************/

    public String getName(){return name;}

    /*****************************************************************
     *
     * Name: getName()
     * Description: This returns the name variable
     * Inputs: This does not take input
     * Returned value: This returns the value from the name variable
     * Preconditions: None
     *
     *****************************************************************/

    public String getBirth(){return birth;}

    /*****************************************************************
     *
     * Name: getBirth()
     * Description: This returns the birth variable
     * Inputs: This does not take input
     * Returned value: This returns the value from the birth variable
     * Preconditions: None
     *
     *****************************************************************/




    public PopularityContestGame(String[] tempArray){

        setRank(tempArray[0]);
        setName(tempArray[1]);
        setBirth(tempArray[2]);

    }


    /*****************************************************************
     *
     * Name: PopularityContestGame()
     * Description: This is a constructor method that sets the rank,name, and birth
     * Inputs: This takes a string array as input in order to set all the variables
     * Returned value: This returns the value from the rank variable
     * Preconditions: None
     *
     *****************************************************************/



    public PopularityContestGame(){}

    /*****************************************************************
     *
     * Name: PopularityContestGame()
     * Description: This is a default constructor method that does nothing
     * Inputs: This does not take input
     * Returned value: This returns no values
     * Preconditions: None
     *
     *****************************************************************/




















    //I put an inputStream.close() next to the return statement, but it warned about a possible exception that did not occur on my machine
    public PopularityContestGame[] sortTextFiles(String[] textFileNames){

        PopularityContestGame[] rankNameBirthArray = null;


        String line;
        String[] split1;
        Scanner inputStream = null;
        int tempValue1 = 0;
        int tempValue2 = 0;
        int arrayValue = 0;

        for (int i = 0; i < textFileNames.length; i++) {


            try {
                inputStream = new Scanner(new FileInputStream(textFileNames[i]));
                while (inputStream.hasNextLine()) {
                    line = inputStream.nextLine();

                    tempValue1++;
                }
            } catch (Exception e) { // better to catch FileNotFoundException
                //System.out.println(e.getMessage());
            }

            rankNameBirthArray = new PopularityContestGame[tempValue1 - textFileNames.length];

        }


        for (int i = 0; i < textFileNames.length; i++) {


            try {
                inputStream = new Scanner(new FileInputStream(textFileNames[i]));
                while (inputStream.hasNextLine()) {
                    arrayValue++;


                    if (i == tempValue2) {
                        line = inputStream.nextLine();
                        tempValue2++;
                    }


                    line = inputStream.nextLine();
                    split1 = line.split(" ");


                    String[] tempArray = {split1[0], split1[1], split1[2]};
                    rankNameBirthArray[(arrayValue - 1)] = new PopularityContestGame(tempArray);


                }
            } catch (Exception e) { // better to catch FileNotFoundException
                //System.out.println(e.getMessage());

            }

        }
        inputStream.close();
        return rankNameBirthArray;
    }

    /*****************************************************************
     *
     * Name: sortTextFiles()
     * Description: This returns sorts out the text files in a given array and returns an array of the PopularityContestGame Class
     * Inputs: This takes a string array of text file names as input
     * Returned value: This returns an array of PopularityContestGame class objects (contains name, rank for each name, and number of births for each name)
     * Preconditions: None
     *
     *****************************************************************/



    public void playGame(PopularityContestGame[] rankNameBirthArray) {

        Scanner keyboard = new Scanner(System.in);
        int decision = 0;
        int answer;
        int tempInt1;
        int tempInt2;


        Random rand = new Random();
        int randomInt1 = rand.nextInt(2000);
        int randomInt2 = rand.nextInt(2000);
        while (randomInt1 == randomInt2) {
            randomInt2 = rand.nextInt(2000);
        }


        System.out.println("It's time to play a game!");
        System.out.print("In 2015, was the name " + rankNameBirthArray[randomInt1].getName() + " (1) ");
        System.out.println("or " + rankNameBirthArray[randomInt2].getName() + " (2) more popular (enter 1 or 2 as your answer)?");


        decision = keyboard.nextInt();

        while (decision > 2) {
            System.out.println("Your number was too high; please try again");
            decision = keyboard.nextInt();
        }

        if (Integer.parseInt(rankNameBirthArray[randomInt1].getBirth()) > Integer.parseInt(rankNameBirthArray[randomInt2].getBirth())) {
            answer = 1;
        } else {
            answer = 2;
        }


        if (decision == answer) {
            if (answer == 1) {
                tempInt1 = randomInt1;
                tempInt2 = randomInt2;
            } else {
                tempInt1 = randomInt2;
                tempInt2 = randomInt1;
            }
            System.out.print("Congrats, you were correct! " + rankNameBirthArray[tempInt1].getName() + " was used as a name " + rankNameBirthArray[tempInt1].getBirth() + " times ");

            System.out.print("while ");

            System.out.println(rankNameBirthArray[tempInt2].getName() + " was used as a name " + rankNameBirthArray[tempInt2].getBirth() + " times.");
        } else {
            if (answer == 1) {
                tempInt1 = randomInt1;
                tempInt2 = randomInt2;
            } else {
                tempInt1 = randomInt2;
                tempInt2 = randomInt1;
            }
            System.out.print("That's too bad, you were incorrect! " + rankNameBirthArray[tempInt2].getName() + " was used as a name " + rankNameBirthArray[tempInt2].getBirth() + " times ");

            System.out.print("while ");

            System.out.println(rankNameBirthArray[tempInt1].getName() + " was used as a name " + rankNameBirthArray[tempInt1].getBirth() + " times.");
        }


        System.out.println("Would you like to play again? (Y/N)");

        String response = keyboard.next();


        while (!response.equals("y") && !response.equals("yes") && !response.equals("n") && !response.equals("no")) {
            System.out.println("There was unexpected input; would you like to play again? (Y/N)");
            response = keyboard.next();
        }


        if (response.equals("y") || response.equals("yes")) {
            playGame(rankNameBirthArray);
        }

    }

    /*****************************************************************
     *
     * Name: playGame()
     * Description: This allows the user to play a game using the array of PopularityContestGame objects where they guess which name is most popular
     * Inputs: This takes an array of PopularityContestGame class objects
     * Returned value: This does not return any values, but outputs text depending on how you play the game
     * Preconditions: None
     *
     *****************************************************************/












}

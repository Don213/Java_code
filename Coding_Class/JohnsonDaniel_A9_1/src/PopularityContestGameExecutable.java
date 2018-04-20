////////////////////////////////
//
// Daniel Johnson
// Assignment 9.1
// 4/17/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program allows the user to play a guessing game that shows them two names and they have to guess which one is more popular (from 2015).
//
//
// INPUTS: The user enters input to guess which name is more popular and to decide if they want to play again.
//
//
// OUTPUTS: This outputs choices to choose from and tells you if you are correct in your judgement.
//
//
//
////////////////////////////////



public class PopularityContestGameExecutable {

    public static void main(String[] args) {

        PopularityContestGame game = new PopularityContestGame();//creates object to access interface methods
        String[] textFileNames = {"boyNames2015.txt","girlNames2015.txt"}; //allows reading of multiple files
        PopularityContestGame[] rankNameBirthArray = game.sortTextFiles(textFileNames); //creates an object array (objects contain ranks, names, and birth numbers for given text files
        game.playGame(rankNameBirthArray);//creates a game to play that accesses the array of objects that contain rank, name, and birth.


    }

}

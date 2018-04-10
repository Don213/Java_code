////////////////////////////////
//
// Daniel Johnson
// Assignment 7.1
// 4/3/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION:This program allows the user/s to play a game of tic-tac-toe
//
//
// INPUTS:There are various inputs depending on what you select from the main menu (Primarily: input to choose menu item, input for row number, input for column number)
//
//
// OUTPUTS: There are various outputs for this program depending on what you choose from the main menu (Primarily: winner, menu, board)
//
//
//
////////////////////////////////












public class TicTacToeExecutable {

    public static void main(String[] args){

        System.out.println("Time to play tic-tac-toe!");//Prompts user for the intense game of tic-tac-toe

        TicTacToe tic = new TicTacToe();//new TicTacToe object

        tic.mainMenu();//executes main menu where the game can be navigated


    }
}

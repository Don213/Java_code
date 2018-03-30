////////////////////////////////
//
// Daniel Johnson
// Assignment 3.2
// 2/22/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program stores players information in a roster allows the user to use the menu shown below to
// utilize and change the information in the roster
//
//MENU
//U - Update Player Rating
//A - Output Players Above A Certain Rating
//R - Replace Player
//O - Output Roster
//Q - Quit
//
//
// INPUTS: This program takes user input for the jersey number and rating of a player. This also takes integer input to
// compare the ratings of a player depending on which option you choose in the menu.
//
// OUTPUTS:This outputs the player's roster and asks for input. This also outputs various other items depending on which
// menu item is chosen. This is further explained in the method documention.
//
//
//
////////////////////////////////








import java.util.Scanner;



public class HockeyTeamRosterExecutable {
    public static void main(String[] args){

        HockeyTeamRoster newTeam = new HockeyTeamRoster(); //Creates new HockeyTeamRoster object

        newTeam.printRoster(); //Prints the roster.

        newTeam.menu();//Makes the menu appear.

    }












}

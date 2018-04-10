import java.util.Scanner;


public class TicTacToe {


    private int x = 0; //counts x moves

    private int o = 0; //counts o moves

    private char[][] board = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
    };




    private void addMove() {
        Scanner keyboard = new Scanner(System.in);
        int row = -1;
        int column = -1;

        if (!winnerTest2().equals("X") && !winnerTest2().equals("O") && x != 5) {

        do {
            if (row == -1) {
                System.out.println("Please enter the row number you wish to play your next move:");
                row = keyboard.nextInt();
            } else {
                System.out.println("Please enter the row number you wish to play your next move; the last entry was invalid:");
                row = keyboard.nextInt();
            }
        } while (row > 3);

        do {
            if (column == -1) {
                System.out.println("Please enter the column number you wish to play your next move:");
                column = keyboard.nextInt();
            } else {
                System.out.println("Please enter the column number you wish to play your next move; the last entry was invalid:");
                column = keyboard.nextInt();
            }
        } while (column > 3);

        if (x == o) {

            if (Character.toString(board[row - 1][column - 1]).equals("X") || Character.toString(board[row - 1][column - 1]).equals("O")) {
                System.out.println("That spot is not open; please try again.");
                addMove();
            } else {
                board[row - 1][column - 1] = 'X';
                x++;
            }
        } else {
            if (Character.toString(board[row - 1][column - 1]).equals("X") || Character.toString(board[row - 1][column - 1]).equals("O")) {
                System.out.println("That spot is not open; please try again.");
                addMove();
            } else {
                board[row - 1][column - 1] = 'O';
                o++;
            }
        }
    }
    else{System.out.println("The game is over; no more moves can be played.");}
    }


    /*****************************************************************
     *
     * Name: addMove()
     * Description: This adds a move to the tic-tac-toe board from user input
     * Inputs: This method takes user input for the row and column number they wish to play their move
     * Returned value: This returns no values
     * Preconditions: The game cannot be over (method still works but will tell you the game is over)
     *
     *****************************************************************/






    private void displayBoard(){
        System.out.print(" " +  board[0][0] + " " + "|"); System.out.print(" " +  board[0][1] + " " + "|"); System.out.println(" " +  board[0][2] + " ");
        System.out.println("-----------");
        System.out.print(" " +  board[1][0] + " " + "|"); System.out.print(" " +  board[1][1] + " " + "|"); System.out.println(" " +  board[1][2] + " ");
        System.out.println("-----------");
        System.out.print(" " +  board[2][0] + " " + "|"); System.out.print(" " +  board[2][1] + " " + "|"); System.out.println(" " +  board[2][2] + " ");
    }


    /*****************************************************************
     *
     * Name: displayBoard()
     * Description: This displays the tic-tac-toe board
     * Inputs: This takes no input
     * Returned value: This returns no values
     * Preconditions: None
     *
     *****************************************************************/






    private void turn(){
        if(!winnerTest2().equals("X") && !winnerTest2().equals("O") && x != 5) {
            if (x == 0) {
                System.out.println("It is X's turn.");
            } else {
                System.out.println("It is O's turn.");
            }
        }
        else{System.out.println("The game is over; no more moves can be played.");}
    }

    /*****************************************************************
     *
     * Name: turn()
     * Description: This displays whose turn it is
     * Inputs: This method takes no input
     * Returned value: This returns no value
     * Preconditions: The game cannot be over (method still works but will tell you the game is over)
     *
     *****************************************************************/


    private String winnerTest2(){
        String testWin ="";
        if (
            (Character.toString(board[0][0]).equals("X") && Character.toString(board[0][1]).equals("X") && Character.toString(board[0][2]).equals("X")) ||
            (Character.toString(board[1][0]).equals("X") && Character.toString(board[1][1]).equals("X") && Character.toString(board[1][2]).equals("X")) ||
            (Character.toString(board[2][0]).equals("X") && Character.toString(board[2][1]).equals("X") && Character.toString(board[2][2]).equals("X")) ||

            (Character.toString(board[0][0]).equals("X") && Character.toString(board[1][0]).equals("X") && Character.toString(board[2][0]).equals("X")) ||
            (Character.toString(board[0][1]).equals("X") && Character.toString(board[1][1]).equals("X") && Character.toString(board[2][1]).equals("X")) ||
            (Character.toString(board[0][2]).equals("X") && Character.toString(board[1][2]).equals("X") && Character.toString(board[2][2]).equals("X")) ||

            (Character.toString(board[0][0]).equals("X") && Character.toString(board[1][1]).equals("X") && Character.toString(board[2][2]).equals("X")) ||
            (Character.toString(board[0][2]).equals("X") && Character.toString(board[1][1]).equals("X") && Character.toString(board[2][0]).equals("X"))){
            //System.out.println("The winner is player X!");
            return "X";
        }
        else if (
            (Character.toString(board[0][0]).equals("O") && Character.toString(board[0][1]).equals("O") && Character.toString(board[0][2]).equals("O")) ||
            (Character.toString(board[1][0]).equals("O") && Character.toString(board[1][1]).equals("O") && Character.toString(board[1][2]).equals("O")) ||
            (Character.toString(board[2][0]).equals("O") && Character.toString(board[2][1]).equals("O") && Character.toString(board[2][2]).equals("O")) ||

            (Character.toString(board[0][0]).equals("O") && Character.toString(board[1][0]).equals("O") && Character.toString(board[2][0]).equals("O")) ||
            (Character.toString(board[0][1]).equals("O") && Character.toString(board[1][1]).equals("O") && Character.toString(board[2][1]).equals("O")) ||
            (Character.toString(board[0][2]).equals("O") && Character.toString(board[1][2]).equals("O") && Character.toString(board[2][2]).equals("O")) ||

            (Character.toString(board[0][0]).equals("O") && Character.toString(board[1][1]).equals("O") && Character.toString(board[2][2]).equals("O")) ||
            (Character.toString(board[0][2]).equals("O") && Character.toString(board[1][1]).equals("O") && Character.toString(board[2][0]).equals("O"))){
            //System.out.println("The winner is player O!");
            return "O";
        }
        else if(
                Character.toString(board[0][0]).equals(" ") ||
                        Character.toString(board[0][1]).equals(" ") ||
                        Character.toString(board[0][2]).equals(" ") ||

                        Character.toString(board[1][0]).equals(" ") ||
                        Character.toString(board[1][1]).equals(" ") ||
                        Character.toString(board[1][2]).equals(" ") ||

                        Character.toString(board[2][0]).equals(" ") ||
                        Character.toString(board[2][1]).equals(" ") ||
                        Character.toString(board[2][2]).equals(" "))
        {return " ";}
        else{return "";}
    }

    /*****************************************************************
     *
     * Name: winnerTest2()
     * Description: This method returns a string to be compared in other methods for checking to see if there is a winner.
     * Inputs: This takes no input
     * Returned value: This returns a string value
     * Preconditions: None
     *
     *****************************************************************/


    private void winnerTest(){
        String testWin ="";
        if (
                (Character.toString(board[0][0]).equals("X") && Character.toString(board[0][1]).equals("X") && Character.toString(board[0][2]).equals("X")) ||
                (Character.toString(board[1][0]).equals("X") && Character.toString(board[1][1]).equals("X") && Character.toString(board[1][2]).equals("X")) ||
                (Character.toString(board[2][0]).equals("X") && Character.toString(board[2][1]).equals("X") && Character.toString(board[2][2]).equals("X")) ||

                (Character.toString(board[0][0]).equals("X") && Character.toString(board[1][0]).equals("X") && Character.toString(board[2][0]).equals("X")) ||
                (Character.toString(board[0][1]).equals("X") && Character.toString(board[1][1]).equals("X") && Character.toString(board[2][1]).equals("X")) ||
                (Character.toString(board[0][2]).equals("X") && Character.toString(board[1][2]).equals("X") && Character.toString(board[2][2]).equals("X")) ||

                (Character.toString(board[0][0]).equals("X") && Character.toString(board[1][1]).equals("X") && Character.toString(board[2][2]).equals("X")) ||
                (Character.toString(board[0][2]).equals("X") && Character.toString(board[1][1]).equals("X") && Character.toString(board[2][0]).equals("X"))){
            //System.out.println("The winner is player X!");
            testWin = "X";
        }
        else if (
                (Character.toString(board[0][0]).equals("O") && Character.toString(board[0][1]).equals("O") && Character.toString(board[0][2]).equals("O")) ||
                (Character.toString(board[1][0]).equals("O") && Character.toString(board[1][1]).equals("O") && Character.toString(board[1][2]).equals("O")) ||
                (Character.toString(board[2][0]).equals("O") && Character.toString(board[2][1]).equals("O") && Character.toString(board[2][2]).equals("O")) ||

                (Character.toString(board[0][0]).equals("O") && Character.toString(board[1][0]).equals("O") && Character.toString(board[2][0]).equals("O")) ||
                (Character.toString(board[0][1]).equals("O") && Character.toString(board[1][1]).equals("O") && Character.toString(board[2][1]).equals("O")) ||
                (Character.toString(board[0][2]).equals("O") && Character.toString(board[1][2]).equals("O") && Character.toString(board[2][2]).equals("O")) ||

                (Character.toString(board[0][0]).equals("O") && Character.toString(board[1][1]).equals("O") && Character.toString(board[2][2]).equals("O")) ||
                (Character.toString(board[0][2]).equals("O") && Character.toString(board[1][1]).equals("O") && Character.toString(board[2][0]).equals("O"))){
            //System.out.println("The winner is player O!");
            testWin = "O";
        }
        else if(
            Character.toString(board[0][0]).equals(" ") ||
            Character.toString(board[0][1]).equals(" ") ||
            Character.toString(board[0][2]).equals(" ") ||

            Character.toString(board[1][0]).equals(" ") ||
            Character.toString(board[1][1]).equals(" ") ||
            Character.toString(board[1][2]).equals(" ") ||

            Character.toString(board[2][0]).equals(" ") ||
            Character.toString(board[2][1]).equals(" ") ||
            Character.toString(board[2][2]).equals(" "))
        {testWin = " ";}
        else{testWin = "";}

        if(testWin.equals("X") || testWin.equals("O")){
            System.out.println("There is a winner.");
        }
        else if(testWin.equals(" ")){
            System.out.println("There is no winner yet; the game is still in progress!");
        }
        else{
            System.out.println("There is no winner.");
        }
    }


    /*****************************************************************
     *
     * Name: winnerTest
     * Description: This determines if there is a winner or not
     * Inputs: This method takes no input
     * Returned value: Does not return a value
     * Preconditions: None
     *
     *****************************************************************/

    private void winnerAnnounce() {
        if (winnerTest2().equals("X")) {
            System.out.println("Player X won!");
        } else if (winnerTest2().equals("O")) {
            System.out.println("Player O won!");
        } else if (winnerTest2().equals(" ")){
            System.out.println("No one has won yet; keep playing!");
        } else {
            System.out.println("No one won!");
        }
    }


    /*****************************************************************
     *
     * Name: HockeyTeamRoster
     * Description: This announces the winner of the tic-tac-toe game
     * Inputs: This takes no input
     * Returned value: Does not return a value
     * Preconditions: Game must be over (method still works but will tell you the game is not over)
     *
     *****************************************************************/

    private void playGame(){

        for(int i = 0; i < 10; i++){
            addMove();
            displayBoard();
            if(winnerTest2().equals("O") || winnerTest2().equals("X") || x == 5){
                if(winnerTest2().equals("X")){
                    System.out.println("The winner is player X!");
                }
                else if(winnerTest2().equals("O")){
                    System.out.println("The winner is player O!");
                }
                else if(x ==5){
                    System.out.println("The game is a draw!");
                }
                //else{continue;}
                break;
            }

        }

    }


    /*****************************************************************
     *
     * Name: playGame
     * Description: This is allows the user/s to play a full round of tic-tac-toe instead of using the menu throughout the game
     * Inputs: This method takes input for the row and column that the user/s wish to play their move
     * Returned value: Does not return a value
     * Preconditions: None
     *
     *****************************************************************/

    private void reinitializeGame(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
        x = 0;
        o = 0;
    }


    /*****************************************************************
     *
     * Name: reinitializeGame
     * Description: This clears the board for the players to play again
     * Inputs: This method takes no input
     * Returned value: Does not return a value
     * Preconditions: None
     *
     *****************************************************************/






    public void mainMenu(){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("a). Add a move");
        System.out.println("b). Display the board");
        System.out.println("c). Determine whose turn it is");
        System.out.println("d). Determine if there is a winner");
        System.out.println("e). Say who the winner is");
        System.out.println("f). Reinitialize the game to the beginning");
        System.out.println("g). Play a continuous game (This will clear any board already in use)");
        System.out.println("h). Exit the game");
        System.out.println();
        System.out.println();
        System.out.println("Please pick an option from the menu.");

        String tempInput = keyboard.next();


        if(tempInput.toLowerCase().equals("a")){
            System.out.println();
            addMove();
            System.out.println();
            mainMenu();
        }
        else if(tempInput.toLowerCase().equals("b")){
            System.out.println();
            displayBoard();
            System.out.println();
            mainMenu();
        }
        else if(tempInput.toLowerCase().equals("c")){
            System.out.println();
            turn();
            System.out.println();
            mainMenu();
        }
        else if(tempInput.toLowerCase().equals("d")){
            System.out.println();
            winnerTest();
            System.out.println();
            mainMenu();
        }
        else if(tempInput.toLowerCase().equals("e")){
            System.out.println();
            winnerAnnounce();
            System.out.println();
            mainMenu();
        }
        else if(tempInput.toLowerCase().equals("f")){
            System.out.println();
            reinitializeGame();
            System.out.println();
            mainMenu();
        }
        else if(tempInput.toLowerCase().equals("g")){
            System.out.println();
            reinitializeGame();
            playGame();
            System.out.println();
            mainMenu();
        }
        else if(tempInput.toLowerCase().equals("h")){
            System.out.println();
            System.out.println("Thank you for playing!");
            System.exit(0);
        }
        else{
            System.out.println();
            System.out.println("There was unexpected input; the menu will be reinitialized.");
            System.out.println();
            mainMenu();
        }

    }



    /*****************************************************************
     *
     * Name: mainMenu
     * Description: This is a user interface that allows the user to control the game of tic-tac-toe and use the other methods created earlier
     * Inputs: This takes string input to determine what you want to do inside of the menu
     *
     *
     * MENU
     * a). Add a move
     * b). Display the board
     * c). Determine whose turn it is
     * d). Determine if there is a winner
     * e). Say who the winner is
     * f). Reinitialize the game to the beginning
     * g). Play a continuous game (This will clear any board already in use)
     * h). Exit the game
     *
     *
     * Returned value: Returns no value
     * Preconditions: None
     *
     *****************************************************************/


}

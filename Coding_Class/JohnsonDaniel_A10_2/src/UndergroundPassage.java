import java.util.Scanner;

public class UndergroundPassage {


    private UndergroundPassage[] NSWE = new UndergroundPassage[4];//Holds references to objects that are the the North, South, West, and East.
    private static UndergroundPassage current,end,unsafe;//variables for use in methods
    private String name;//might be useless but will be kept in code


    UndergroundPassage(String name){
        this.name = name;
        for(int i = 0; i < 4; i++){
            NSWE[i] = null;
        }
    }

    /*****************************************************************
     *
     * Name: undergroundPassage()
     * Description: This is a default constructor that sets the name variable as the given string and everything in the NSWE array as null
     * Inputs: This takes a string as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    UndergroundPassage(){
        this.name = null;
        for(int i = 0; i < 4; i++){
            NSWE[i] = null;
        }
    }

    /*****************************************************************
     *
     * Name: undergroundPassage()
     * Description: This is a default constructor that sets the name variable as null and everything in the NSWE array as null
     * Inputs: This takes no input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public void setNorth(UndergroundPassage north){
        NSWE[0] = north;
    }

    /*****************************************************************
     *
     * Name: setNorth()
     * Description: This sets the 1st item in the array of NSWE
     * Inputs: This takes an UndergroundPassage object as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public void setSouth(UndergroundPassage south){
        NSWE[1] = south;
    }

    /*****************************************************************
     *
     * Name: setSouth
     * Description: This sets the 2nd item in the array of NSWE
     * Inputs: This takes an UndergroundPassage object as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public void setEast(UndergroundPassage east){
        NSWE[2] = east;
    }

    /*****************************************************************
     *
     * Name: setEast()
     * Description: This sets the 3rd item in the array of NSWE
     * Inputs: This takes an UndergroundPassage object as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public void setWest(UndergroundPassage west){
        NSWE[3] = west;
    }

    /*****************************************************************
     *
     * Name: setWest()
     * Description: This sets the 4th item in the array of NSWE
     * Inputs: This takes an UndergroundPassage object as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public UndergroundPassage[] getNSWE() {
        return NSWE;
    }

    /*****************************************************************
     *
     * Name: getNSWE()
     * Description: This returns the NSWE array of UndergroudPassage objects
     * Inputs: This takes no input
     * Returned value: This returns the NSWE array of UndergroudPassage objects
     * Preconditions: None
     *
     *****************************************************************/

    public static void setCurrent(UndergroundPassage current1){
        current = current1 ;
    }

    /*****************************************************************
     *
     * Name: setCurrent()
     * Description: This sets the current UndergroundPassage object
     * Inputs: This takes an UndergroundPassage object as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public static UndergroundPassage getCurrent() {
        return current;
    }

    /*****************************************************************
     *
     * Name: getCurrent()
     * Description: This returns the current UndergroundPassage object
     * Inputs: This takes no input
     * Returned value: This returns the current UndergroundPassage object
     * Preconditions: None
     *
     *****************************************************************/

    public static void setEnd(UndergroundPassage end1){
        end = end1;
    }

    /*****************************************************************
     *
     * Name: setEnd()
     * Description: This sets the end UndergroundPassage object
     * Inputs: This takes an UndergroundPassage object as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public static UndergroundPassage getEnd() {
        return end;
    }

    /*****************************************************************
     *
     * Name: getEnd()
     * Description: This returns the end UndergroundPassage object
     * Inputs: This takes no input
     * Returned value: This returns the end UndergroundPassage object
     * Preconditions: None
     *
     *****************************************************************/

    public static void setUnsafe(UndergroundPassage unsafe1){
        unsafe = unsafe1;
    }

    /*****************************************************************
     *
     * Name: setUnsafe()
     * Description: This sets the unsafe UndergroundPassage object
     * Inputs: This takes an UndergroundPassage object as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public static UndergroundPassage getUnsafe() {
        return unsafe;
    }

    /*****************************************************************
     *
     * Name: getUnsafe()
     * Description: This returns the unsafe UndergroundPassage object.
     * Inputs: This takes no input.
     * Returned value: This returns the unsafe UndergroundPassage object.
     * Preconditions: None.
     *
     *****************************************************************/




    public static void goingThroughPassage(){
        Scanner keyboard = new Scanner(System.in);

        int messageChange = -1;
        int validResponse = -1;


        System.out.println("Enter your direction to move as N, S, E, or W.");

        while(getCurrent() != getEnd() && getCurrent() != getUnsafe()) {
            int count = 0;
            for(int j = 0; j < getCurrent().getNSWE().length; j++) {
                if (getCurrent().getNSWE()[j] != null) {
                    count++;
                }
            }
            String[] tempStringArray = new String[count];
            for(int j = 0, s = 0; j < getCurrent().getNSWE().length; j++) {
                if (getCurrent().getNSWE()[j] != null) {
                    if(j == 0) {
                        tempStringArray[s] = "north";
                        s++;
                    }
                    else if(j == 1) {
                        tempStringArray[s] = "south";
                        s++;
                    }
                    else if(j == 2) {
                        tempStringArray[s] = "east";
                        s++;
                    }
                    else if(j == 3) {
                        tempStringArray[s] = "west";
                        s++;
                    }
                }
            }
            if(messageChange == -1) {
                System.out.print("You awaken in a maze of twisty little passages, all alike. You can go: ");
                messageChange = 0;
            }
            else{System.out.print("You are in a maze of twisty little passages, all alike. You can go: ");}
            for(int j = 0; j < tempStringArray.length; j++){
                if(tempStringArray.length == 1){
                    System.out.print(tempStringArray[j] + ".");
                }
                else if (j != (tempStringArray.length - 1)){
                    System.out.print(tempStringArray[j] + ", ");
                }
                else {
                    System.out.print("or " + tempStringArray[j] + ".");
                }
            }

            System.out.println();

            validResponse = -1;
            while(validResponse == -1){
                String response = keyboard.next();
                if(response.toLowerCase().equals("n") || response.toLowerCase().equals("north")){
                    if(getCurrent().getNSWE()[0] != null){
                        validResponse = 0;
                        setCurrent(getCurrent().getNSWE()[0]);
                    }
                    else{System.out.println("You cannot go that way. Try again.");}
                }
                else if(response.toLowerCase().equals("s") || response.toLowerCase().equals("south")){
                    if(getCurrent().getNSWE()[1] != null){
                        validResponse = 0;
                        setCurrent(getCurrent().getNSWE()[1]);
                    }
                    else{System.out.println("You cannot go that way. Try again.");}
                }
                else if(response.toLowerCase().equals("east") || response.toLowerCase().equals("east")){
                    if(getCurrent().getNSWE()[2] != null){
                        validResponse = 0;
                        setCurrent(getCurrent().getNSWE()[2]);
                    }
                    else{System.out.println("You cannot go that way. Try again.");}
                }
                else if(response.toLowerCase().equals("west") || response.toLowerCase().equals("west")){
                    if(getCurrent().getNSWE()[3] != null){
                        validResponse = 0;
                        setCurrent(getCurrent().getNSWE()[3]);
                    }
                    else{System.out.println("You cannot go that way. Try again.");}
                }
                else{System.out.println("There was incorrect input try again");}
            }


        }

        if(getCurrent() != getUnsafe()){
            System.out.println("You got out safely... This time...");
        }
        else{System.out.println("OH NO! You were caught by Wumpus and never heard from again...");}















    }

    /*****************************************************************
     *
     * Name: goingThroughPassage()
     * Description: This utilizes most of the above methods to have the user traverse through a simulated maze of objects that
     * reference each other through their NSWE arrays.
     * Inputs: This takes no input, but the user inputs which direction they would like to go in the maze that it describes.
     * Returned value: This returns no value, but tells you which direction you can go and if you have arrived at a certain spot.
     * Preconditions: Objects must be initialized and the current and end and unsafe variables must be set or errors will ensue.
     *
     *****************************************************************/


}

import java.util.Scanner;



public class Car {

    Scanner keyboard = new Scanner(System.in);

    private String name;
    private int mpg;



    public String getName(){return name;}
    public int getMpg(){return mpg;}


    public String setName(){

        System.out.println("Enter the vehicle name.");
        name = keyboard.nextLine();

        return null;
    }


    public String setMpg(){

        System.out.println("Enter the vehicle's miles per gallon");

        try{ mpg = Integer.parseInt(keyboard.nextLine());
        }
        catch(java.lang.NumberFormatException e){

            System.out.println("Input was not correct");
        }


        return null;
    }


}

import java.util.Scanner;

public class SurveyResponse {


Scanner keyboard = new Scanner(System.in);


    private int favor;

    private int against;

    private int undecided;



    public void setFavor(int favor1){




        try{
            favor1 = Integer.parseInt(keyboard.nextLine());
        }
        catch(java.lang.NumberFormatException e){

            System.out.println("Input for \"favor\" was not correct");
        }

        favor = favor1;
    }

    public void setAgainst(int against1){

        try{
            against1 = Integer.parseInt(keyboard.nextLine());
        }
        catch(java.lang.NumberFormatException e){

            System.out.println("Input for \"against\" was not correct");
        }

        against = against1;
    }


    public void setUndecided(int undecided1){

        try{
            undecided1 = Integer.parseInt(keyboard.nextLine());
        }
        catch(java.lang.NumberFormatException e){

            System.out.println("Input for \"undecided\" was not correct");
        }

        favor = undecided1;
    }






}

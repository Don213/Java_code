import java.util.Scanner;
import java.util.Random;


public class RPS {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        Random random = new Random();


        System.out.println("Let\'s play rock, paper, scissors! Enter \"R\", \"P\", or \"S\" below:\n");

        String answer = keyboard.nextLine().toLowerCase().trim();

        String compAnswer = "0";



        String randomRPS = Integer.toString(random.nextInt(3) + 1);

        switch(randomRPS) {
            case ("1"):
                compAnswer = "r";
            case("2"):
                compAnswer = "p";
            case("3"):
                compAnswer = "s";
        }

        System.out.println(compAnswer);






        }
        //System.out.println(answer);

    }
//}

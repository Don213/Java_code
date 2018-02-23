import java.util.Scanner;
import java.util.Random;






public class InfiniteLoopThing {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in); //Creates scanner object

        Random random = new Random(); //Creates random object


        String compAnswer = "0"; //Initializes compAnswer

        int heads = 0;
        int tails = 0;
        int i = 0;

        while(i >= 0){
            String randomHT = Integer.toString(random.nextInt(2));
            //Generates a random number from 0-2. includes 0 and 2. Does not go up to 3. Adds 1 to get up to 3.
            //The integer is also converted to string to make the switch statement comparison below easier.

            //Assigns values of rock, paper, or scissors to the random integers generated above.
            switch (randomHT) {
                case "0":
                    compAnswer = "h";
                    break;
                case "1":
                    compAnswer = "t";
                    break;
            }

            if (compAnswer.equals("h")) {
                System.out.println("The answer is heads; " + "There are currently " + heads++ +" Tosses");
            } else {
                System.out.println("The answer is tail; " + "There are currently " + tails++ + " Tosses");
            }
            i++;

        }

        System.out.println("The amount of heads is equal to: " + heads);
        System.out.println("The amount of tails is equal to: " + tails);


    }
}

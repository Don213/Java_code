import java.util.Scanner;

/*
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
*/




public class Haircut {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String errorMessage = "Please restart the program; there was an unexpected input.";

        System.out.println("Your hair looks terrible! You need a haircut!");
        System.out.println();
        System.out.println("Take this quiz to figure out what haircut you should get. Choose and type \"a\" or \"b\" as your answer.");
        System.out.println();
        System.out.println("a)Male or b)Female");

        String q1 = keyboard.nextLine().toLowerCase().trim();


        if (q1.equals("a")) {
            System.out.println("a)Super Hero or b)Super Villain");
            String q2 = keyboard.nextLine().toLowerCase().trim();

            if (q2.equals("b")) {
                System.out.println("You should get a mohawk!");
            }
            else if (q2.equals("a")){
                System.out.println("a)Steak or b)Sushi");
                String q3 = keyboard.nextLine().toLowerCase().trim();

                if(q3.equals("a")) {
                    System.out.println("You should get a flat top!");
                }
                else if(q3.equals("b")){
                    System.out.println("You should get a pompadour!");
                }
                else{System.out.println(errorMessage);}
            }
            else {System.out.println(errorMessage);}
        }

        else if (q1.equals("b")) {
            System.out.println("a)Super Hero or b)Super Villain");
            String q2 = keyboard.nextLine().toLowerCase().trim();

            if (q2.equals("b")) {
                System.out.println("You should get a mohawk!");
            }
            else if (q2.equals("a")){
                System.out.println("a)Anime or b)Sitcom");
                String q3 = keyboard.nextLine().toLowerCase().trim();

                if(q3.equals("a")) {
                    System.out.println("You should get bangs!");
                }
                else if(q3.equals("b")){
                    System.out.println("You should get a bob!");
                }
                else{System.out.println(errorMessage);}



            }
        }
        else{System.out.println(errorMessage);}
    }
}

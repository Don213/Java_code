import java.util.Scanner;






public class BouncingBall {


    public static void main(String[] args){

        Scanner keyboard  = new Scanner(System.in);

        System.out.println("It's time to play with the bouncing ball!");
        System.out.println("Please enter an initial velocity for the ball: ");

        double velocity= keyboard.nextInt();
        double height = 0;
        double gravity = 32;
        int bounce = 1;
        int time = 0;

        while(bounce <= 5){


            if (height < 0){
                System.out.println("Bounce " + bounce);
                //velocity = velocity + 32;
                height = height * -0.5;
                velocity = velocity * -0.5;
                velocity = velocity - gravity * 1.5;
                bounce++;

                //System.out.println("Time: " + time + " Height: " + height);
            }

            else{
                System.out.println("Time: " + time + " Height: " + height);
                height = height + velocity;
                velocity = velocity - gravity;


            }















            time++;
        }





















    }
}

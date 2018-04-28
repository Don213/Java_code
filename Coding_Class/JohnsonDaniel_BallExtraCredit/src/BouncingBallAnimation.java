////////////////////////////////
//
// Daniel Johnson
// Assignment Extra Credit
// 4/27/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program creates two bouncing balls and two bouncing images
//
//
// INPUTS: There is no user input; however, the program does take in a png and jpg file to display thier images.
//
//
// OUTPUTS: This outputs two bouncing balls and two bouncing pictures
//
//
//
////////////////////////////////
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

import java.awt.*;

public class BouncingBallAnimation extends Application {
    private int time = 0; // keep track of simulation time here

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Pane root = new Pane();
        root.setPrefSize(1000,800); // window size

        // TODO: create instances of your ball class here
        BouncingBall ball1 = new BouncingBall(850, 700, 30, -45, 2, "blue");
        BouncingBall ball2 = new BouncingBall( 300, 700, 10, -20, 1, "red" );

        BouncingImage image1 = new BouncingImage(450,500, -40, 3,"witmer_frank.jpg");
        BouncingImage image2 = new BouncingImage(75,600, -20, 0.5,"detective_conan.png");
        System.out.println("Simulation time = " + time);

        // Timeline to call the event handler every 10ms
        // to update a bouncing ball
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(10),
                        new EventHandler<ActionEvent>()
                        {
                            // don't worry too much about the Timeline, KeyFrame, & EventHandler code
                            // TODO: you will need to modify the code in this handle method
                            @Override
                            public void handle(ActionEvent event)
                            {
                                time++;
                                System.out.println("Simulation time = " + time);



                                //updates location of the images and balls //the input into the method tells them where not to cross
                                ball1.updateLocation((root.getHeight() - 50));
                                ball2.updateLocation((root.getHeight() - 25));
                                image1.updateLocation((root.getHeight() - 325));
                                image2.updateLocation((root.getHeight() - 225));

                            }
                        }
                )
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.play();

        // TODO: be sure to add instances of your ball here
        root.getChildren().add(ball1);
        root.getChildren().add(ball2);
        root.getChildren().add(image1);
        root.getChildren().add(image2);

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Bouncing Items");
        primaryStage.setAlwaysOnTop(true); // make sure window is on top (foreground)
        primaryStage.show();

    }

}
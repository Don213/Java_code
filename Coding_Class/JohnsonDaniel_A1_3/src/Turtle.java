import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Turtle extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();                    // Creates an empty pane
        Scene scene = new Scene(root);

        //Creates canvas
        Canvas canvas = new Canvas(600, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();



        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Sets fill color to green
        gc.setFill(Color.GREEN);


        ///////Head and Tail
        //Head
        gc.fillOval(175, 50, 50, 100);
        gc.strokeOval(175, 50, 50, 100);

        //Tail
        gc.fillOval(182.5, 350, 37.5, 75);
        gc.strokeOval(182.5, 350, 37.5, 75);
        ///////Head and Tail



        /////////////////Legs
        //Top Right
        gc.fillArc(200, 100, 100, 50, 90, 360, ArcType.OPEN);
        gc.strokeArc(200, 100, 100, 50, 90, 360, ArcType.OPEN);

        //Top Left
        gc.fillArc(100, 100, 100, 50, 90, 360, ArcType.OPEN);
        gc.strokeArc(100, 100, 100, 50, 90, 360, ArcType.OPEN);

        //Bottom Right
        gc.fillArc(200, 325, 100, 50, 90, 360, ArcType.OPEN);
        gc.strokeArc(200, 325, 100, 50, 90, 360, ArcType.OPEN);

        //Bottom Left
        gc.fillArc(100, 325, 100, 50, 90, 360, ArcType.OPEN);
        gc.strokeArc(100, 325, 100, 50, 90, 360, ArcType.OPEN);
        /////////////////Legs



        //Changes fill color to black
        gc.setFill(Color.BLACK);




        /////////Eyes
        //Left
        gc.fillOval(187.5, 62.5, 5, 5);
        gc.strokeOval(187.5, 62.5, 5, 5);

        //Right
        gc.fillOval(206.25, 62.5, 5, 5);
        gc.strokeOval(206.25, 62.5, 5, 5);
        /////////Eyes


        //Sets fill color to dark olive green
        gc.setFill(Color.DARKOLIVEGREEN);





        /////Body
        gc.fillOval(100, 100, 200, 300);
        gc.strokeOval(100, 100, 200, 300);
        /////

        /*

        When it says first, second, and third, it is going
        from the innermost objects to the outermost objects.

        */

        //Fourth Vertical Oval
        //gc.fillOval(112.5, 162.5, 175, 175);
        gc.strokeOval(112.5, 112.5, 175, 275);

        //Third Middle Circle
        gc.fillOval(112.5, 162.5, 175, 175);
        gc.strokeOval(112.5, 162.5, 175, 175);
        //

        //Second Vertical Oval
        gc.fillArc(150, 162.5, 100, 175, 180, 360, ArcType.OPEN);
        gc.strokeArc(150, 162.5, 100, 175, 180, 360, ArcType.OPEN);
        //

        //Second Horizontal Oval
        gc.fillArc(112.5, 200, 175, 100, 180, 360, ArcType.OPEN);
        gc.strokeArc(112.5, 200, 175, 100, 180, 360, ArcType.OPEN);
        //

        //Second Middle Circle
        gc.fillOval(150, 200, 100, 100);
        gc.strokeOval(150, 200, 100, 100);
        //



        //First Vertical Oval
        gc.fillArc(175, 200, 50, 100, 180, 360, ArcType.OPEN);
        gc.strokeArc(175, 200, 50, 100, 180, 360, ArcType.OPEN);
        //

        //First Horizontal Oval
        gc.fillArc(150, 225, 100, 50, 90, 360, ArcType.OPEN);
        gc.strokeArc(150, 225, 100, 50, 90, 360, ArcType.OPEN);
        //

        //Center Circle (First Circle)
        gc.fillOval(175, 225, 50, 50);
        gc.strokeOval(175, 225, 50, 50);
        //


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        int moveOver = 330; //moves the box over because I did not want to add

        ///////Creates a dialogue box for the turtle to speak
        double[] xPnts = {30 + moveOver, 60 + moveOver, 60 + moveOver, 250 + moveOver, 250 + moveOver, 30 + moveOver};
        double[] yPnts = {120, 100, 30, 30, 100, 120};

        gc.strokePolygon(xPnts, yPnts, xPnts.length);
        ///////

        //////Creates text for the box made above
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("Times New Roman", 16));
        gc.fillText("Am I pretty enough?!", 410, 55);
        gc.fillText("Do I need more pretty?!", 410, 85);
        //////


        root.getChildren().add(canvas);
        primaryStage.setTitle("A Very Pretty Turtle"); //Names Window
        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true); // Makes window appear above everything else
        primaryStage.show();
    }
}

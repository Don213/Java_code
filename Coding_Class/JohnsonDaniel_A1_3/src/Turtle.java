



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
            launch(args);  // launch the JavaFX application and call the start method
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            Pane root = new Pane();                    // Create an empty pane
            Scene scene = new Scene(root);

            Canvas canvas = new Canvas(400, 300);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.YELLOW);

            gc.fillOval(100, 50, 200, 200);
            gc.strokeOval(100, 50, 200, 200);
//    gc.setFill(Color.MAGENTA);
            gc.setFill(Color.rgb(255, 150, 0)); // orange
            gc.fillOval(155, 100, 10, 20);
            gc.fillOval(230, 100, 10, 20);
            gc.strokeArc(150, 160, 100, 50, 180, 180, ArcType.OPEN);
            gc.setFont(Font.font("Times New Roman", 16));
            gc.setFill(Color.BLACK);
            gc.fillText("My Smiley Face!", 50, 270);
            // draw a hat
            gc.setFill(Color.RED);
            gc.fillArc(100, 10, 200, 50, -50, 280, ArcType.ROUND);

            // Drawing polygons...
            // can increase flexibility by declaring arrays of type double
            //   and passing them to fillPolygon, but we haven't covered arrays yet...
            double[] xPnts = {50, 60, 70, 60, 50};
            double[] yPnts = {30, 30, 60, 90, 90};
            gc.fillPolygon(xPnts, yPnts, xPnts.length);

            root.getChildren().add(canvas);
            primaryStage.setTitle("HappyFace in JavaFX");
            primaryStage.setScene(scene);
            primaryStage.setAlwaysOnTop(true); // make sure window is on top (foreground)
            primaryStage.show();
        }
    }

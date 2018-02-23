////////////////////////////////
//
// Daniel Johnson
// Assignment 3.3
// 2/22/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program plays reduces the red coloration in the eyes of the given picture.
//
//
// INPUTS: There is no user input, but there is a photo used and manipulated
//
//
// OUTPUTS: This program outputs a color corrected photo (in the eyes) of a girl.
//
//
//
////////////////////////////////












import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;


/**
 * class to read and display an image file
 */
public class RedEyeReduction extends Application {

    @Override
    public void start(Stage primaryStage) {
        // These next lines Create Image and ImageView objects
        // file must be located in same directory as .java file
        //    except for NetBeans, in which case it should be up a level in the src folder
        Image image = new Image("redeye_image.jpg");
        ImageView imageView = new ImageView();
        imageView.setImage(image);

        // could hard code these dimensions, but better to extract from the image
        double imgWidth = image.getWidth();
        double imgHeight = image.getHeight();
        System.out.println("Image dimensions: " + imgWidth + " x " + imgHeight);

// The next three lines scale the image to fit the window
        imageView.setFitWidth(imgWidth);
        imageView.setFitHeight(imgHeight);
        imageView.setPreserveRatio(true);

        // Obtain PixelReader to extract pixel values from the image
        PixelReader pixelReader = image.getPixelReader();
// Create WritableImage to create a new image
        WritableImage wImage = new WritableImage((int)imgWidth,
                (int)imgHeight);
        PixelWriter pixelWriter = wImage.getPixelWriter();

        // **** modify the code here to manipulate the image *****

    // explore the image by printing out the first line of RGB values
    for (int x = 0; x < imgWidth; x++) {
      int y = 0;
      Color color = pixelReader.getColor(x, y);
      double r, g, b;
      r = color.getRed();
      g = color.getGreen();
      b = color.getBlue();
      //System.out.println("For pixel ("+x+", "+y+"), red = "+r+", green = "+g+", blue = "+b);
    }




        int imgWidth2 = (int)Math.round(imgWidth);
        int imgHeight2 = (int)Math.round(imgHeight);

        //loops through all of the pixels//
        for (int y = 0; y < imgHeight2; y++) {
            for (int x = 0; x < imgWidth2; x++) {
        //loops through all of the pixels//

                //reads the colors//
                Color color = pixelReader.getColor(x, y);
                double r, g, b;
                r = color.getRed();
                g = color.getGreen();
                b = color.getBlue();
                //reads the colors//



                //Color corrects the eyes when in bound//
                if((x >= 133 && x <= 169 && y >= 169 && y <= 185) || (x >= 256 && x <= 270 && y >= 143 && y <= 157)){
                pixelWriter.setColor(x, y, new Color(((g+b)/2), g, b,1.0));
                }
                //Color corrects the eyes when in bound//
                //Sets the color to the same value if not in eye bounds
                else{pixelWriter.setColor(x,y, color);}
                //Sets the color to the same value if not in eye bounds
            }
        }



    imageView.setImage(wImage); // overwrite the original image

        // Display image on screen using a Vertical Box layout
        VBox root = new VBox();
        root.getChildren().add(imageView);
        // use the image width & height for window size
        Scene scene = new Scene(root, imgWidth, imgHeight);
        primaryStage.setTitle("Display Image");
        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true); // make sure window is on top (foreground)
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}

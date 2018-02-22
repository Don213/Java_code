import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;

/**
 * class to read and display an image file
 */
public class OGC extends Application {

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
        for (int y = 0; y < imgHeight; y++) {
            //int y = 0;
            Color color = pixelReader.getColor(x, y);
            double r, g, b;
            r = color.getRed();
            g = color.getGreen();
            b = color.getBlue();
            //System.out.println(color);
            //System.out.println("For pixel (" + x + ", " + y + "), red = " + r + ", green = " + g + ", blue = " + b);
        }
    }
    // what will this code do?
    for (int y = 0; y < imgHeight; y++) {
      for (int x = 0; x < imgWidth; x++) {
        Color color = pixelReader.getColor(x, y);
        if (y > 10)
          color = Color.RED;
          System.out.println(color);
        pixelWriter.setColor(x,y,color);
      }
    }

/*
    // reduce the brightness by a factor of 2
    for (int y = 0; y < imgHeight; y++) {
      for (int x = 0; x < imgWidth; x++) {
        Color color = pixelReader.getColor(x, y);
        double r = color.getRed() / 2.0;
        double g = color.getGreen() / 2.0;
        double b = color.getBlue() / 2.0;
        int red = (int) (r * 255);
        int green = (int) (g * 255);
        int blue = (int) (b * 255);
        color = Color.rgb(red,green,blue);
        pixelWriter.setColor(x,y,color);
      }
    }

    // Other modifications to try:
    // - increase the brightness by multiplying by 2
    //    (though be careful not to exceed max rgb value of 255
    // - convert to grayscale by taking the average of r, g, & b
*/
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

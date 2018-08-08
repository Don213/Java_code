import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import java.util.Random;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;



public class BouncingImage extends ImageView{

    private double x,y;

    private double velocity, gravitationalForce;



    public BouncingImage(String imagePath) {
        setImage(new Image(imagePath));
        this.gravitationalForce = 1;
        this.velocity = 20;
        this.y = y;
        this.x = x;
        setY(200);
        setX(300);
    }

    /*****************************************************************
     *
     * Name: BouncingImage()
     * Description: This is a constructor that takes the name of a image path and sets everything else to a chosen default
     * Inputs: This takes a string as input for the name
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/


    public BouncingImage(double x, double y, double velocity, double gravitationalForce, String imagePath){

        setImage(new Image(imagePath));
        this.velocity = velocity;
        this.gravitationalForce = gravitationalForce;
        this.y = y;
        this.x = x;
        setX(x);
        setY(y);

    }

    /*****************************************************************
     *
     * Name: BouncingImage()
     * Description: This is a constructor for the BouncingImage class
     * Inputs: This takes an x-coordinate (double), y-coordinate (double), starting velocity (double),
     * gravitational force (double), and the name of the file path for the picture (String) as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/



    public void updateLocation(double badLocationNumber) {
        if ((getY() + velocity) < badLocationNumber || velocity < 0) {
                velocity += gravitationalForce;
                y += (velocity);
        }
        else if((getY() + velocity) > badLocationNumber){
            halfReverseVelocity();
            if(java.lang.Math.abs(velocity) < 1){
                velocity = 0;
            }
        }
        setY(y);
    }

    /*****************************************************************
     *
     * Name: updateLocation()
     * Description: This updates the location of the picture
     * Inputs: This takes a double as input that tells the program where the image cannot cross
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    private void halfReverseVelocity(){
        this.velocity *= -0.5;
    }

    /*****************************************************************
     *
     * Name: halfReverseVelocity()
     * Description: This multiplies the current velocity of the image by -0.5
     * Inputs: This takes no input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/








}

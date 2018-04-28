import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;





public class BouncingBall extends Circle {

    private double x,y;

    private double velocity, gravitationalForce;


    public BouncingBall() {
        setRadius(25);

        setFill(Color.BLACK);

        this.gravitationalForce = 0.5;
        this.velocity = 20;
        this.x = 400;
        this.y = 300;
    }

    /*****************************************************************
     *
     * Name: BouncingBall()
     * Description: This is a default constructor for the BouncingBall class (Used for testing)
     * Inputs: This takes no input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public BouncingBall(double x, double y, double radius, double velocity, double gravitationalForce, String redYellowBlue) {
        setRadius(radius);


        if(redYellowBlue.toLowerCase().equals("red")){
            setFill(Color.RED);
        }
        else if(redYellowBlue.toLowerCase().equals("yellow")){
            setFill(Color.YELLOW);
        }
        else if(redYellowBlue.toLowerCase().equals("blue")){
            setFill(Color.BLUE);
        }
        else{
            setFill(Color.BLACK);
        }

        this.gravitationalForce = gravitationalForce;
        this.velocity = velocity;
        this.x = x;
        this.y = y;

        setCenterX(this.x);
        setCenterY(this.y);
    }

    /*****************************************************************
     *
     * Name: BouncingBall()
     * Description: This is a constructor for the BouncingBall class
     * Inputs: This takes an x-coordinate (double), y-coordinate (double), radius of the ball (double), starting velocity (double),
     * gravitational force (double), and a color of the ball (String) as input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/



    public void updateLocation(double badLocationNumber) {
        if ((y + velocity) < badLocationNumber || velocity < 0) {
                velocity += gravitationalForce;
                y += (velocity);
        }
        else{
            halfReverseVelocity();
            if(java.lang.Math.abs(velocity) < 1){
                velocity = 0;
            }
        }
        setCenterX(x);
        setCenterY(y);

    }

    /*****************************************************************
     *
     * Name: updateLocation()
     * Description: This updates the location of the ball
     * Inputs: This takes a double as input that tells the program where the ball cannot cross
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
     * Description: This multiplies the current velocity of the ball by -0.5
     * Inputs: This takes no input
     * Returned value: This returns no value
     * Preconditions: None
     *
     *****************************************************************/

    public double getX() {
        return x;
    }

    /*****************************************************************
     *
     * Name: getX()
     * Description: This returns the x-coordinate of the ball
     * Inputs: This takes no input
     * Returned value: This returns the variable x
     * Preconditions: None
     *
     *****************************************************************/

    public double getY() {
        return y;
    }

    /*****************************************************************
     *
     * Name: getY
     * Description: This returns the y-coordinate of the ball
     * Inputs: This takes no input
     * Returned value: This returns the variable y
     * Preconditions: None
     *
     *****************************************************************/























}

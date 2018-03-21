// There is nothing to change in this file.
// It creates two Counter objects, each of which is displayed in a window.
// The windows may appear on top of each other so you may need to move one to see the other.
import javafx.application.Application;
import javafx.stage.Stage;

public class CounterMain extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
    }
}
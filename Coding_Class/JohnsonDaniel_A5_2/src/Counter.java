// This class implements a button-click counter.
// You only need to complete the "TO DO" parts.
// You don't need to worry about how the rest works.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class Counter extends Stage
{
    // ****** TO DO: Create a private int variable here named "counter" initialized to 0
    private static int counter = 0;
    //private int counter = 0;
    // ****** TO DO: First make this variable static and run the program, clicking on the buttons.

    // ****** TO DO: Then remove the static and run the program, clicking the buttons.

    // ****** TO TURN IN: In a comment here, explain the different behavior when it is static vs. non-static.


    ////////////
    //When the variable is in a static state, the objects shared the variable while they did not share the variable in a nonstatic state.
    //They shared the variable by adding to not depending on which window you used while in the static state.
    //They had independent variables that kept track of the number that each window was on in a nonstatic state.
    //All new objects of the class share the variable.
    ////////////


    public Counter()
    {
        FlowPane root = new FlowPane();
        Button btnAddOne;
        Button btnRefresh;
        Label lblCounter;
        lblCounter = new Label("0");
        btnAddOne = new Button("Add One");
        btnRefresh = new Button("Refresh");

        // This code runs when the "Add One" button is clicked
        btnAddOne.setOnAction(e ->
                {
                    counter++;
                    lblCounter.setText(Integer.toString(counter));
                }
        );
        // This code runs when the "Refresh" button is clicked
        btnRefresh.setOnAction(e ->
                {
                    lblCounter.setText(Integer.toString(counter));
                }
        );

        root.getChildren().add(lblCounter);
        root.getChildren().add(btnAddOne);
        root.getChildren().add(btnRefresh);

        Scene scene = new Scene(root, 250, 50);
        setTitle("Counter");
        setScene(scene);
        show();
    }
}

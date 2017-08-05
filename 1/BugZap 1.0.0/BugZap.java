import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

 
public class BugZap extends Application {
    public static void main(String[] args) {
        launch(args);
    }   // end main method
    
    @Override
    public void start(Stage primaryStage) {
        // Set the title of Stage, a top-level container (the app window)
        primaryStage.setTitle("Bug Zap 1.0.0");
        
        // Create a layout container to hold the button
        BorderPane borderLayout = new BorderPane();
        
        // Set layout container background to black
        borderLayout.setStyle("-fx-background-color: black");
        
        // Create a scene (300 x 300) to hold the layout container
        Scene scene = new Scene(borderLayout, 300, 300);
        
        // Set the scene to the Stage
        primaryStage.setScene(scene);
        
        // Create button player clicks to zap bug
        Button zapButton = new Button();
        
        // Add button text
        zapButton.setText("Zap Bug");
        
        // Set button background to red
        zapButton.setStyle("-fx-background-color: red");
        
        // Add button-click event handler
        zapButton.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bug zapped!");
            }
        }); // end setOnAction call
        
        // Set the button in the center of the container
        borderLayout.setCenter(zapButton);
        
        // Start the show, display the Stage
        primaryStage.show();
    }   // end start method
    
}   // end BugZap class
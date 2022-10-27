package project4_13;

// imported libraries

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Project4_13 extends Application {
	// random variables for center x and center y
	private int centerX;
	private int centerY;
	// 
	Random random = new Random();

	@Override
	public void start(Stage primaryStage) throws Exception {
		// set the two random variables equal to 0
		centerX = 0;
		centerY = 0;
		
		// make circle with center x and y of 200 and radius 40
		Circle circle = new Circle(200, 200, 40);
		circle.setFill(Color.RED);
		
		// button  push text "push me!"
		Button push = new Button("Push me!");
		// used lambda expression to randomly change the button position when the button is pushed
		push.setOnAction((event) -> {
			// randomize a number between 1 - 400 for centerX
			centerX = random.nextInt(400) + 1;
			// randomize a number between 1 - 300 for centerY
			centerY = random.nextInt(300) + 1;
			// then set the randomly selected positions
			circle.setCenterX(centerX);
			circle.setCenterY(centerY);
		});
		
		// put the push button in flowpane
		FlowPane pane = new FlowPane(push);
		// center the position
		pane.setAlignment(Pos.CENTER);
		// make the background white
		pane.setStyle("-fx-background-color: white");
		
		// put the circle in the group root first then the pane
		Group root = new Group(circle, pane);
		
		// add the root to the scene set the width 400 and height 300
		Scene scene = new Scene(root, 450, 350);
		
		// set the scene in primaryStage
		primaryStage.setScene(scene);
		// then show the stage
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		// launch the javafx application
		launch(args);

	}

}

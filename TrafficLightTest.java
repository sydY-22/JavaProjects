package project5_18;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TrafficLightTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// create class object instance from TrafficLight class
		TrafficLight light = new TrafficLight();
		// align the class object and set background color to be light blue
		light.setAlignment(Pos.CENTER);
		light.setStyle("-fx-background-color: lightblue");
		
		// create the Scene 
		Scene scene = new Scene(light, 500, 250);
		
		// title, set scene, and show
		primaryStage.setTitle("Traffic Light");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		// launch the javafx application
		launch(args);

	}

}

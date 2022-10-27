package project5_18;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TrafficLight extends HBox {
	// declare shapes and RadioButtons
	private Rectangle rect1;
	private Circle redCircle, orangeCircle, greenCircle;
	private RadioButton redLight, orangeLight, greenLight;

	public TrafficLight() {
		// initialize rectangle constructor
		rect1 = new Rectangle(75, 0, 100, 200);
		rect1.setFill(Color.BLACK);
		
		// initialize red circle constructor
		redCircle = new Circle(125, 50, 25);
		redCircle.setFill(Color.RED);
		
		// initialize orange circle constructor
		orangeCircle = new Circle(125, 100, 25);
		orangeCircle.setFill(Color.GRAY);
		
		// initialize green circle constructor
		greenCircle = new Circle(125, 150, 25);
		greenCircle.setFill(Color.GRAY);
		
		// include all shapes in the Group root
		Group root = new Group(rect1, redCircle, orangeCircle, greenCircle);
		
		// declare ToggleGroup to toggle between selected options
		ToggleGroup group = new ToggleGroup();
		
		// initialize the red light radio button
		redLight = new RadioButton("Stop");
		// set selected value to be true
		redLight.setSelected(true);
		// include in toggle group so the option can be toggle on/off
		redLight.setToggleGroup(group);
		// action handler
		redLight.setOnAction(this::processRadioButtonAction);
		
		// initialize the orange light radio button
		orangeLight = new RadioButton("Caution");
		orangeLight.setToggleGroup(group);
		orangeLight.setOnAction(this::processRadioButtonAction);
		
		// initialize green light radio button
		greenLight = new RadioButton("Go");
		greenLight.setToggleGroup(group);
		greenLight.setOnAction(this::processRadioButtonAction);
		
		// include the radio buttons in VBox to lay it out in vertical column
		VBox options = new VBox(redLight, orangeLight, greenLight);
		
		// set the position and spacing
		options.setAlignment(Pos.CENTER_LEFT);
		options.setSpacing(10);
		
		// add radio buttons and shapes
		getChildren().addAll(options, root);
		
	}
	
	// event handler for radio button press
	public void processRadioButtonAction(ActionEvent event) {
		// if selected "Stop" 
		if (redLight.isSelected()) {
			// turn circle color red
			redCircle.setFill(Color.RED);
			// leave/make the rest blank
			orangeCircle.setFill(Color.GRAY);
			greenCircle.setFill(Color.GRAY);
		}
		// if selected "Caution"
		else if (orangeLight.isSelected()) {
			// turn circle color orange
			orangeCircle.setFill(Color.ORANGE);
			// leave/make the rest blank
			redCircle.setFill(Color.GRAY);
			greenCircle.setFill(Color.GRAY);
		}
		// if selected "Go" 
		else {
			// turn circle color green
			greenCircle.setFill(Color.GREEN);
			// leave/make the rest blank
			redCircle.setFill(Color.GRAY);
			orangeCircle.setFill(Color.GRAY);
		}
	}

}




import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button myButton;
	Button myButton2;
	Button myButton3;
	Button myButton4;
	Button myButton5;
	Label messageLabel;
	TextField myTextField;
	//  declare two HBoxes
	HBox hbox;
	HBox hbox1;

	//student Task #4:
	//  declare an instance of DataManager
	DataManager myData;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		 myButton = new Button("Hello");
		myButton2 = new Button("Howdy");
		 myButton3 = new Button("Chinese");
		myButton4 = new Button("Clear");
		myButton5 = new Button("Exit");
		
		myButton.setOnAction(new ButtonHandler());
		myButton2.setOnAction(new ButtonHandler()); 
		myButton3.setOnAction(new ButtonHandler()); 
		myButton4.setOnAction(new ButtonHandler()); 
		myButton5.setOnAction(new ButtonHandler()); 


		myTextField = new TextField();
		messageLabel = new Label("Feedback");
		//  instantiate the HBoxes
		HBox hBox = new HBox();
		HBox hBox1 = new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		myData = new DataManager();
		//  set margins and set alignment of the components
		hBox.setMargin(myButton, new Insets(10)); 
		hBox.setAlignment(Pos.CENTER); 
		hBox.setMargin(myButton2, new Insets(10)); 
		hBox.setAlignment(Pos.CENTER); 
		hBox.setMargin(myButton3, new Insets(10)); 
		hBox.setAlignment(Pos.CENTER); 
		hBox.setMargin(myButton4, new Insets(10)); 
		hBox.setAlignment(Pos.CENTER); 
		hBox.setMargin(myButton5, new Insets(10)); 
		hBox.setAlignment(Pos.CENTER); 
		hBox1.setMargin(myTextField, new Insets(0)); 
		hBox1.setAlignment(Pos.CENTER); 
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hBox1.getChildren().addAll(messageLabel,myTextField);
		//  add the buttons to the other HBox
		hBox.getChildren().addAll(myButton,myButton2,myButton3,myButton4,myButton5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox, hBox1);  
		
	
	}
	
	//Task #4:
	class ButtonHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
		
		if(event.getTarget() == myButton) {
			myTextField.setText(myData.getHello());
		}
		else if(event.getTarget() == myButton2) {
			myTextField.setText(myData.getHowdy());

		}
		else if(event.getTarget() == myButton3) {
			myTextField.setText(myData.getChinese());
		}
	else if(event.getTarget() == myButton4) {
			myTextField.setText(" ");
		}
		else if(event.getTarget() == myButton5) {
			Platform.exit(); 
			System.exit(0); 
		}
		}

	}
}
	
package Controls;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MeinRadioButton extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		Image image = new Image(getClass().getResourceAsStream("meinIcon.jpg"));
		Button button = new Button("Button", new ImageView(image));
		button.setFont(new Font("Ubuntu",30));
		button.setWrapText(true);
		RadioButton rb = new RadioButton("Unsere Box");
		RadioButton rb2 = new RadioButton("Unsere Box2");
		RadioButton rb3 = new RadioButton("Unsere Box3");
		ToggleGroup tgroup = new ToggleGroup();
		Label label = new Label("Hallo Welt!");
		label.textProperty().bind(Bindings.concat("Checkbox: ", rb.selectedProperty()));
		
		rb.setToggleGroup(tgroup);
		rb2.setToggleGroup(tgroup);
		rb3.setToggleGroup(tgroup);
		
		root.getChildren().add(button);
		root.getChildren().add(label);
		root.getChildren().add(rb);
		root.getChildren().add(rb2);
		root.getChildren().add(rb3);
		
		
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				label.setText("Selber Hallo!");
				
			}
			
		});
		
		Scene scene = new Scene(root,400,400);
		primaryStage.setTitle("Tolles Fenster");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}catch(Exception e) {
		e.printStackTrace();
	}		
}

	public static void main(String[] args) {
		launch(args);
	}
}

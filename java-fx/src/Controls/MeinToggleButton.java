package Controls;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MeinToggleButton extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		Image image = new Image(getClass().getResourceAsStream("meinIcon.jpg"));
		Button button = new Button("Button", new ImageView(image));
		button.setFont(new Font("Ubuntu",30));
		button.setWrapText(true);
		ToggleButton tb = new ToggleButton("Unsere Box");
		ToggleButton tb2 = new ToggleButton("Unsere Box2");
		ToggleButton tb3 = new ToggleButton("Unsere Box3");
		ToggleGroup tgroup = new ToggleGroup();
		Label label = new Label("Hallo Welt!");
		label.textProperty().bind(Bindings.concat("Checkbox: ", tb.selectedProperty()));
		
		tb.setToggleGroup(tgroup);
		tb2.setToggleGroup(tgroup);
		tb3.setToggleGroup(tgroup);
		
		root.getChildren().add(button);
		root.getChildren().add(label);
		root.getChildren().add(tb);
		root.getChildren().add(tb2);
		root.getChildren().add(tb3);
		
		
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

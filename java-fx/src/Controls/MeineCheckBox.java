package Controls;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MeineCheckBox extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		Image image = new Image(getClass().getResourceAsStream("meinIcon.jpg"));
		Button button = new Button("Button", new ImageView(image));
		button.setFont(new Font("Ubuntu",30));
		button.setWrapText(true);
		CheckBox cb = new CheckBox("Unsere Box");
		cb.setIndeterminate(true);
		Label label = new Label("Hallo Welt!");
		label.textProperty().bind(Bindings.concat("Checkbox: ", cb.selectedProperty()));
		
		
		root.getChildren().add(button);
		root.getChildren().add(label);
		root.getChildren().add(cb);
				
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

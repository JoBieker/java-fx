package Controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeinTextField extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		
		TextField name = new TextField();
		Button submit = new Button("Submit");
		Label label = new Label("");
		
		name.setPromptText("Geben Sie Ihren Namen ein!");
		
		root.getChildren().add(name);
		root.getChildren().add(submit);
		root.getChildren().add(label);
		
		submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				label.setText("Hallo "+name.getText());				
			}
			
		});
		
		Scene scene = new Scene(root,400,400);
		primaryStage.setTitle("Tolles Fenster");
		primaryStage.setScene(scene);
		primaryStage.show();
		submit.requestFocus();
	}catch(Exception e) {
		e.printStackTrace();
	}		
}

	public static void main(String[] args) {
		launch(args);
	}
}

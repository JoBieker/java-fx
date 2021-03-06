package Controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineTextarea extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		
		TextArea textArea = new TextArea();
		Button submit = new Button("Submit");
		Label label = new Label("");
		
		textArea.setPromptText("Bitte geben Sie einen Text ein!");
		textArea.setPrefRowCount(3);
		
		root.getChildren().add(textArea);
		root.getChildren().add(submit);
		root.getChildren().add(label);
		
		submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				label.setText("Hallo "+textArea.getText());				
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

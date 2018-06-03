package Controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * J.S weist daraufhin, dass wegen der Methode getText()
 * der Einsatz des Password-Fields problematisch ist,
 * da ein immutable String Objekt erzeugt wird, dass im 
 * Arbeitsspeicher verbleibt, bis der Garbage Collector
 * es abräumt. In dieser Zeit kann es aus dem RAM ausgelesen 
 * werden. Oracle hat die Methode aber noch nicht geändert.
 */

public class MeinPasswordField extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		
		PasswordField name = new PasswordField();
		Button submit = new Button("Submit");
		Label label = new Label("");
		
		name.setPromptText("Bitte geben Sie Ihr Passwort ein!");
		
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

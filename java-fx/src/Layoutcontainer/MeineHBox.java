package Layoutcontainer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MeineHBox extends Application {
	
	public void start(Stage primaryStage) {
		try {
			// Param in Konstruktor definiert Abstand zwischen den Nodes in der HBox
			HBox root = new HBox(10);
			
			root.getChildren().add(new Button("Eins"));
			root.getChildren().add(new Button("Zwei"));
			root.getChildren().add(new Button("Drei"));
			root.getChildren().add(new Button("Vier"));

			
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

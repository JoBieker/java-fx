package Layoutcontainer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class MeinTextFlow extends Application {
	
	public void start(Stage primaryStage) {
		try {
			// Param in Konstruktor definiert Abstand zwischen den Nodes in der Box
			TextFlow root = new TextFlow();
			
			root.getChildren().add(new Text("Dies ist ein Satz. "));
			root.getChildren().add(new Text("Dies ist ein Satz. "));
			root.getChildren().add(new Text("Dies ist ein Satz. "));
			root.getChildren().add(new Text("Dies ist ein Satz. "));
			root.getChildren().add(new Text("Dies ist ein Satz. "));
			root.getChildren().add(new Text("Dies ist ein Satz. "));
			
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

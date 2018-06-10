package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.Spinner;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeinSpinner extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			
			Spinner<Integer> spinner = new Spinner<Integer>(0, 100, 300);
			spinner.setEditable(true);
			
			root.getChildren().add(spinner);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Tolles Fenster!");
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

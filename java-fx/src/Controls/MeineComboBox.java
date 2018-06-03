package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineComboBox extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			ComboBox<String> cb = new ComboBox<>();
			cb.setEditable(true);
			cb.getItems().addAll("Berg","Tal","Wald","Wiese","Pudding");
			
			root.getChildren().add(cb);
			
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

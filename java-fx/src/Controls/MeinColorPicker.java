package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MeinColorPicker extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			ColorPicker cp = new ColorPicker();
			Text text = new Text("Hallo");
			text.fillProperty().bind(cp.valueProperty());
			
			
			root.getChildren().add(cp);
			root.getChildren().add(text);
			
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

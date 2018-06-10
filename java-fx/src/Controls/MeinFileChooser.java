package Controls;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MeinFileChooser extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			Button b = new Button("Öffnen...");
			
			b.setOnAction((ActionEvent e) -> {
				FileChooser fc = new FileChooser();
				File f = fc.showOpenDialog(primaryStage);
				//File f = fc.showOpenMultipleDialog(primaryStage);
				//File f = fc.showOpenSaveDialog(primaryStage);
			});
			
			root.getChildren().add(b);

			
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

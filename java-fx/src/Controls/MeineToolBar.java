package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineToolBar extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			ToolBar toolBar = new ToolBar(
					new Button("Neu"),
					new Button("Öffnen..."),
					new Button("Speichern"),
					new Button("Speichern unter..."),
					new Separator(),
					new Button("Drucken")
					);
			
			root.getChildren().add(toolBar);
			
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

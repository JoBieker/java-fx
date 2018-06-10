package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineButtonBar extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			ButtonBar buttonBar = new ButtonBar();
			
			Button jaButton = new Button("Ja");
			ButtonBar.setButtonData(jaButton, ButtonData.YES);
			Button neinButton = new Button("Nein");
			ButtonBar.setButtonData(neinButton, ButtonData.NO);
			// See https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/ButtonBar.html
			buttonBar.setButtonOrder("YN+");
			
			buttonBar.getButtons().addAll(jaButton, neinButton);

			root.getChildren().add(buttonBar);
			
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

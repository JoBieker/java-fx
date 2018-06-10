package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineSplitPane extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			SplitPane sp = new SplitPane();
			
			VBox vb1 = new VBox();
			vb1.getChildren().add(new Button("Button1"));
			VBox vb2 = new VBox();
			vb2.getChildren().add(new Button("Button2"));
			VBox vb3 = new VBox();
			vb3.getChildren().add(new Button("Button3"));
			sp.getItems().addAll(vb1,vb2,vb3);
			sp.setDividerPositions(0.33, 0.66);

			root.getChildren().add(sp);
			
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

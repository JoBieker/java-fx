package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeinProgressIndicator extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			Slider slider = new Slider();
			slider.setMin(-1);
			slider.setMax(1);
			ProgressIndicator pb = new ProgressIndicator();
			
			pb.progressProperty().bind(slider.valueProperty());
			
			root.getChildren().add(slider);
			root.getChildren().add(pb);
			
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

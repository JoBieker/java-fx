package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeinSlider extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			Slider slider = new Slider();
			slider.setMin(0);
			slider.setMax(360);
			slider.setShowTickLabels(true);
			slider.setMajorTickUnit(45);
			slider.setShowTickMarks(true);
			slider.setMinorTickCount(9);
			slider.setBlockIncrement(5);
			
			ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("katze.jpg")));
						
			imageView.rotateProperty().bind(slider.valueProperty());
			
			root.getChildren().add(imageView);
			root.getChildren().add(slider);
			
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

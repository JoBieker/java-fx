package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineScrollbar extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			ScrollPane sp = new ScrollPane();
			sp.setContent(new ImageView(new Image(getClass().getResourceAsStream("katze.jpg"))));
			sp.setPrefSize(200,200);
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

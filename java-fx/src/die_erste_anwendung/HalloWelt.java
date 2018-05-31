package die_erste_anwendung;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HalloWelt extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			Label label = new Label("Hallo Welt!");
			root.getChildren().add(label);
			
			Scene scene = new Scene(root,400,100);
			primaryStage.setTitle("Tolles Fenster");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

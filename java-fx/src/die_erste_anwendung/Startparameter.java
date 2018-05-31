package die_erste_anwendung;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Startparameter werden, ausser 
 * im Debugging in der GUI-Programmierung
 * eher weniger verwendet. 
 * Der Vollständigkeit halber erwähnt Jakob Schaal es
 * dennoch.
 */

public class Startparameter extends Application {

	@Override
	public void start(Stage primaryStage) {
		System.out.println("Bin in der Start");
		VBox root = new VBox();
		Label label = new Label("Hallo Welt!");
		root.getChildren().add(label);
		
		Scene scene = new Scene(root,400,100);
		primaryStage.setTitle("Tolles Fenster");
		primaryStage.setScene(scene);
		primaryStage.show();
		}
	
	@Override
	public void init() throws Exception {
		System.out.println("Bin in der init!");
		
		Parameters p = getParameters();
		List<String> list = p.getRaw();
		
		for(String r: list) {
			System.out.println(r);
		}
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println("Bin in der Stop!");
	}

	public static void main(String[] args) {
		
		System.out.println("Bin vor dem Launch!");
		launch(args);
		System.out.println("Bin hinter dem Launch!");
	}
}

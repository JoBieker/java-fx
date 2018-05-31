package die_erste_anwendung;

import javafx.application.Application;
//import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Der JavaFXApplication-Thread wird während des
 * LifCycle einer JavaFXApplication fortwährend 
 * im Hintergrund ausgeführt. Er prüft, ob es
 * User-Eingaben gibt, die dem Programm gemeldet
 * werden müssen.
 */

public class DerJavaFxApplicationThread extends Application {

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
		// Keine Gui-Elemente in der init!
		// Führt zu Exception
		System.out.println("Bin in der init!");
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println("Bin in der Stop!");
	}

	public static void main(String[] args) {
		
		Thread t = new Thread(()-> {
			try {
				Thread.sleep(20000);
			}catch (Exception e){
				e.printStackTrace();				
			}
			
			//Platform.exit();
			System.exit(0);
		});
		t.start();
		
		System.out.println("Bin vor dem Launch!");
		launch(args);
		System.out.println("Bin hinter dem Launch!");
	}
}

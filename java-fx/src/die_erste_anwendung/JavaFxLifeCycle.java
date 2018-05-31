package die_erste_anwendung;

import javafx.application.Application;
//import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Wenn noch ein Konstruktor existieren würde,
 * dann würde dieser noch vor der init ausgeführt.
 * Ansonsten läuft die Reihenfolge wie hier gezeigt:
 * 1. main 
 * 2. init
 * 3. start
 * 4. stop
 * 5. main
 * 
 * Platform.exit beendet in der Art,
 * dass die App alle Methoden noch sauber abarbeiten kann.
 * 
 * System.exit lässt dagegen die Stop-Methode nicht mehr zu.
 */
	
	public class JavaFxLifeCycle extends Application {
	
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
					Thread.sleep(2000);
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


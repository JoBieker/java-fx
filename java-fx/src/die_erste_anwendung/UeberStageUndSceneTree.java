package die_erste_anwendung;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * 1. die Stage, die die Scene enthält.
 * 2. In der Scene können Nodes enthalten sein.
 * 3. Es gibt Parent-Nodes, wie die VBox, die
 *    andere Nodes, sogenannte Child-Nodes enthalten können.
 * 4. Es gibt Child-Nodes, wie Label.
 */
	
	public class UeberStageUndSceneTree extends Application {
	
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
					
			System.out.println("Bin vor dem Launch!");
			launch(args);
			System.out.println("Bin hinter dem Launch!");
		}
	}


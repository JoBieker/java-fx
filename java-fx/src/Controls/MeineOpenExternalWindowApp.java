package Controls;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineOpenExternalWindowApp extends Application {
	
	public void start(Stage primaryStage) {
			VBox root = new VBox();
			
			Hyperlink hl = new Hyperlink("http://www.google.de");
			
			root.getChildren().add(hl);
			
			hl.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {		
					if(Desktop.isDesktopSupported()) {
						new Thread(() ->  {
							try {
									Desktop.getDesktop().browse(new URI(hl.getText()));
							}catch(IOException | URISyntaxException e) {
								e.printStackTrace();
							}
						}).start();
					}else {
						System.out.println("Desktop is not supported.");
					}
						
				}
			});
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Tolles Fenster!");
			primaryStage.setScene(scene);
			primaryStage.show();
	
	
		}
		
				

		public static void main(String[] args) {
			launch(args);
		}
}

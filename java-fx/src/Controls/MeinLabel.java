package Controls;

import java.util.List;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MeinLabel extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			// Wie kann man die Fonts auf dem System ausgeben?
			List<String> fonts = Font.getFontNames();
			for(String font : fonts) {
				System.out.println(font);
			}
			
			VBox root = new VBox();
			Image image = new Image(getClass().getResourceAsStream("meinIcon.jpg"));
			Label label = new Label("Hallo Welt! Das ist ein langes label, weil es sehr viel Text beinhaltet.", new ImageView(image));
			label.setFont(new Font("Ubuntu",30));
			label.setWrapText(true);
			root.getChildren().add(label);
			
			label.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					label.setRotate(180);
					
				}
				
			});
			
			label.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					label.setRotate(0);
					
				}
				
			});
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Tolles Fenster");
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

package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineTitledPane extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		VBox wdays = new VBox();
		VBox weday = new VBox();

		CheckBox cb1 = new CheckBox("Montag");
		CheckBox cb2 = new CheckBox("Dienstag");
		CheckBox cb3 = new CheckBox("Mittwoch");
		CheckBox cb4 = new CheckBox("Donnerstag");
		CheckBox cb5 = new CheckBox("Freitag");
		CheckBox cb6 = new CheckBox("Samstag");
		CheckBox cb7 = new CheckBox("Sontag");
		
		wdays.getChildren().addAll(cb1,cb2,cb3,cb4, cb5);
		weday.getChildren().addAll(cb6, cb7);
		
		root.getChildren().add(new TitledPane("Arbeitstage",wdays));
		root.getChildren().add(new TitledPane("Wochenende",weday));
		
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

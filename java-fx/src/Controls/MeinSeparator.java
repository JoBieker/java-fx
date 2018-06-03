package Controls;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeinSeparator extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		CheckBox cb1 = new CheckBox("Montag");
		CheckBox cb2 = new CheckBox("Dienstag");
		CheckBox cb3 = new CheckBox("Mittwoch");
		CheckBox cb4 = new CheckBox("Donnerstag");
		CheckBox cb5 = new CheckBox("Freitag");
		CheckBox cb6 = new CheckBox("Samstag");
		CheckBox cb7 = new CheckBox("Sontag");
		
		root.getChildren().addAll(cb1,cb2,cb3,cb4, cb5);
		root.getChildren().add(new Separator(Orientation.HORIZONTAL));
		root.getChildren().addAll(cb6, cb7);
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

package Controls;



import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineChoiceBox extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();

		
		String[] helloWorlds = new String[] {"Hallo Welt", "Hello World", "Bonjour monde"};
		
		ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList("German", "English", "French"));
		Label label = new Label("");
		
		cb.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label.setText(helloWorlds[newValue.intValue()]);
				
			}
			
		});

		root.getChildren().add(label);
		root.getChildren().add(cb);
				
	
		
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

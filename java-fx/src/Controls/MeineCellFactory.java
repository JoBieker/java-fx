package Controls;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineCellFactory extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		
		ObservableList<String> data = FXCollections.observableArrayList();
		for(int i = 0; i < 18; i++) {
			data.add("Undefined");
		}
		
		ObservableList<String> selections = FXCollections.observableArrayList("Meer","Berg","Himmel");
		
		ListView<String> list = new ListView<>();
		list.setItems(data);
		list.setPrefHeight(100);
		list.setEditable(true);
		list.setCellFactory(ComboBoxListCell.forListView(selections));				
		root.getChildren().add(list);
		
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

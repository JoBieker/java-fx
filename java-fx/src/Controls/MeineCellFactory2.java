package Controls;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MeineCellFactory2 extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
				
		ObservableList<String> data = FXCollections.observableArrayList("#FF0000","#00FF00","#0000FF");
		
		ListView<String> list = new ListView<>();
		list.setItems(data);
		list.setPrefHeight(100);
		
		list.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
			
			@Override
			public ListCell<String> call(ListView<String> param) {
				return new ColorCell();
			}
		});
		
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
	
	private class ColorCell extends ListCell<String>{
		@Override
		protected void updateItem(String item, boolean empty) {
			super.updateItem(item, empty);
			
			Rectangle rect = new Rectangle(20,20);
			if(item != null && empty == false) {
				Color c = Color.web(item);
				setGraphic(rect);
				rect.setFill(c);
				setText(item);
			}
		}
	}
}

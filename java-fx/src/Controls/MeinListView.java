package Controls;

import static javafx.collections.FXCollections.observableArrayList;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MeinListView extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		
		ObservableList<String> items = FXCollections.observableArrayList("Meer","Berg","Strand","Tal","Wald","Wiese");
		ListView<String> list = new ListView<>();
		list.setItems(items);
		list.setPrefHeight(100);
		list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		Label label = new Label("");
				
		list.getSelectionModel().getSelectedIndices().addListener(new ListChangeListener<Integer>() {

			@Override
			public void onChanged(Change<? extends Integer> c) {
				ObservableList<? extends Integer> innerlist = c.getList();
				StringBuilder sb = new StringBuilder();
				
				for(int i = 0; i < innerlist.size();i++) {
					sb.append(items.get(innerlist.get(i))+"\n");
				}
				label.setText(sb.toString());
			}
		});
		
		root.getChildren().add(list);
		root.getChildren().add(label);
		
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

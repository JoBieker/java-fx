package Controls;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MeinePagination extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			Pagination p1 = new Pagination(5);
			
			p1.setPageFactory(new Callback<Integer, Node>() {
				
				@Override
				public Node call(Integer param) {
					// Shows if the pages are kept in memory or not
					// and they are not.
					System.out.println(param);
					VBox vBox = new VBox();
					vBox.getChildren().add(new Label("Hallo, dies ist Seite " +(param+1)));
					// Work	around, so Pagination is presented at the bottom of its node.
					// 
					vBox.setPrefHeight(100000);
					return vBox;
				}
			});
			
			root.getChildren().add(p1);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Tolles Fenster!");
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

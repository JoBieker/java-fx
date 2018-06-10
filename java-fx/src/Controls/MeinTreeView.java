package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeinTreeView extends Application {
	public void start(Stage primaryStage) {
	try {
		VBox root = new VBox();
		
		TreeItem<String> rootItem = new TreeItem<String>("Posteingang");
		for(int i = 0; i < 10; i++) {
			TreeItem<String> item = new TreeItem<String>("Nachricht"+i);
			rootItem.getChildren().add(item);
		}
		TreeView<String> tree = new TreeView<String>(rootItem);
		
		root.getChildren().add(tree);
		
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

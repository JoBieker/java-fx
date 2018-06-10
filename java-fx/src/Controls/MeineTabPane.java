package Controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeineTabPane extends Application {
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			/*
			 * TabPane holds Tab
			 * Tab holds Parent node like VBox
			 * VBox in Tab holds Element Nodes
			 * like Buttons.
			 * 
			 */
			TabPane tabPane = new TabPane();
			Tab tab1 = new Tab("Tab1");
			VBox tab1Content = new VBox();
			tab1.setContent(tab1Content);
			tab1Content.getChildren().addAll(new Button("Button1_1"), new Button("Button1_2"));
			tab1.setClosable(false);
			
			Tab tab2 = new Tab("Tab2");
			VBox tab2Content = new VBox();
			tab2.setContent(tab2Content);
			tab2Content.getChildren().addAll(new Button("Button2_1"), new Button("Button2_2"));
			
			tabPane.getTabs().add(tab1);
			tabPane.getTabs().add(tab2);
			root.getChildren().add(tabPane);
			
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

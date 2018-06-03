package Controls;

import java.io.File;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MeinMenu extends Application {
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
		
		Accordion acc = new Accordion();
		acc.getPanes().add(new TitledPane("Arbeitstage",wdays));
		acc.getPanes().add(new TitledPane("Wochenende",weday));
		
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("Datei");
		MenuItem menuItemNew = new MenuItem("Neu");
		MenuItem menuItemOpen = new MenuItem("Öffnen...");
		MenuItem menuItemSave = new MenuItem("Speichern");
		MenuItem menuItemSaveAs = new MenuItem("Speichern unter...");
		MenuItem menuItemClose = new MenuItem("Schließen");
		
		menuItemOpen.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				FileChooser fc = new FileChooser();
				File f = fc.showOpenDialog(primaryStage);
			}
		});
		
		menuItemSave.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				FileChooser fc = new FileChooser();
				File f = fc.showSaveDialog(primaryStage);	
			}
		});
		
		menuItemClose.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Platform.exit();
				
			}
		});
		

		menuFile.getItems().addAll(menuItemNew, menuItemOpen, menuItemSave, menuItemSaveAs, new SeparatorMenuItem(),menuItemClose);
		menuBar.getMenus().add(menuFile);
		

		root.getChildren().add(menuBar);
		root.getChildren().add(acc);

		
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

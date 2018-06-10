package Controls;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MeinHTMLEditor extends Application {
	
	private String htmlEditorContent;
	
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			HTMLEditor htmlEditor = new HTMLEditor();

			htmlEditorContent = htmlEditor.getHtmlText();
			
			root.getChildren().add(htmlEditor);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Tolles Fenster!");
			primaryStage.setScene(scene);
			primaryStage.show();

		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(htmlEditorContent);
	}


		public static void main(String[] args) {
			launch(args);
		}
}

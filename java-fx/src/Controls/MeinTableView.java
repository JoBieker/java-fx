package Controls;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MeinTableView extends Application {
	public void start(Stage primaryStage) {
	try {
		
		VBox root = new VBox();
		
		ObservableList<Person> data = FXCollections.observableArrayList(new Person("Jörg","Bieker","joerg@bieker.nrw"),
																		new Person("Justus", "Bieker", "justus@bieker.nrw"),
																		new Person("Adrian", "Bieker", "adrian@bieker.nrw")
																		);
		
		TableView<Person> tablePersonen = new TableView<Person>();
		tablePersonen.setItems(data);
		
		TableColumn<Person, String> names = new TableColumn<>("Name");
		names.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
		TableColumn<Person, String> lastnames = new TableColumn<>("Lastname");
		lastnames.setCellValueFactory(new PropertyValueFactory<Person, String>("lastname"));
		TableColumn<Person, String> emails = new TableColumn<>("Email");
		emails.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
		
		tablePersonen.getColumns().add(names);
		tablePersonen.getColumns().add(lastnames);
		tablePersonen.getColumns().add(emails);
		
		root.getChildren().add(tablePersonen);
		
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
	
	public class Person{
		private StringProperty name;
		private StringProperty lastname;
		private StringProperty email;
		
		public Person(String name, String lastname, String email) {
			this.name = new SimpleStringProperty(name);
			this.lastname = new SimpleStringProperty(lastname);;
			this.email = new SimpleStringProperty(email);
		}
		
		/**** name ****/
		public String getName() {
			return name.get();
		}
		
		public void setName(String name) {
			this.name.set(name);
		}
		
		public StringProperty nameProperty() {
			return this.name;
		}
		
		/**** lastname ****/
		public String getLastname() {
			return lastname.get();
		}
		
		public void setLastname(String lastname) {
			this.lastname.set(lastname);
		}
		
		public StringProperty lastnameProperty() {
			return this.lastname;
		}
		
		/**** email ****/
		public String getEmail() {
			return email.get();
		}
		
		public void setEmail(String email) {
			this.email.set(email);
		}
		
		public StringProperty emailProperty() {
			return this.email;
		}
		
	}
}

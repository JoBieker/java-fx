package Properties;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * Konventionen der javafx Property Beans:
 * getName, setName, Konstruktor Methoden
 */
public class PropertyKonventionen {
	
	private StringProperty name = new SimpleStringProperty();
	
	public String getName() {
		return name.get();
	}
	
	public void setName(String newName) {
		name.set(newName);
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public static void main(String[] args) {
		
	}

}

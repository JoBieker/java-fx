package Properties;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class MeinIntegerProperty {

	public static void main(String[] args) {

		IntegerProperty ip = new SimpleIntegerProperty();
		
		ip.set(10);
		ip.addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println("Alter Wert: " + oldValue);
				System.out.println("Neuer Wert: " + newValue);
				System.out.println("-----------------------");
			}
			
		});
		
		ip.set(100);
		ip.set(1000);

	}

}

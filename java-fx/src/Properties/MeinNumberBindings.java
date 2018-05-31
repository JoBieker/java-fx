package Properties;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/*
 * Demonstriert das Binding mit SimpleIntegerProperty.
 * Achtung: Gebundenen Properties darf nur dann ein
 * Wert zugewiesen werden, wenn Sie bidrektional gebunden sind.
 * Beispiel in Kommentaren
 */

public class MeinNumberBindings {

	public static void main(String[] args) {

		IntegerProperty ip = new SimpleIntegerProperty();
		IntegerProperty ip2 = new SimpleIntegerProperty();
		
		//ip2.bind(ip);
		//ip2.bindBidirectional(ip);
		
		ip.set(10);
		ip2.set(12);
		
		NumberBinding nb = ip.add(ip2);
		
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
		
		//ip2.set(10000);
		
		System.out.println("ip = "+ip.get());
		System.out.println("ip2 = "+ip2.get());
		System.out.println("-----------------------");
		System.out.println("nb = "+nb.getValue());
	}

}

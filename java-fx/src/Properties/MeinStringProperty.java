package Properties;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableStringValue;
import javafx.beans.value.ObservableValue;



public class MeinStringProperty {

	public static void main(String[] args) {

	StringProperty sp = new SimpleStringProperty();
	StringProperty sp2 = new SimpleStringProperty();
	
/*	sp2.addListener(new ChangeListener<String>() {

		@Override
		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			System.out.println("Alter Wert = "+oldValue);
			System.out.println("Neuer Wert = "+newValue);
			System.out.println("-----------------------");
		}		
	});*/
	//sp2.set(".jpg");
	sp.set("Mond");
	sp2.bind(Bindings.concat(sp,".jpg"));
	
	sp2.addListener(new InvalidationListener() {

		@Override
		public void invalidated(Observable observable) {
			String oValue = ((ObservableStringValue)observable).get();
			System.out.println("Property wurde invalide. oValue = "+oValue);
			System.out.println("Property wurde invalide.");
		}		
	});
	
	System.out.println("------------");
	System.out.println("sp2 = "+sp2.get());
	sp.set("Meer");
	System.out.println("------------");
	System.out.println("sp2 = "+sp2.get());
	sp.set("Wald");
	System.out.println("------------");
	System.out.println("sp = "+sp.get());
	sp.set("Pilz");
	System.out.println("------------");
	System.out.println("sp = "+sp.get());
	sp.set("Moor");
	System.out.println("------------");
	System.out.println("sp2 = "+sp2.get());
	sp.set("Mantra");
	}
}

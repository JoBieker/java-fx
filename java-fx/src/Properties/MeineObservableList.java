package Properties;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class MeineObservableList {
	
	public static void main(String[] args) {
		
		ObservableList<String> o1 = FXCollections.observableArrayList();
		
		o1.addListener(new ListChangeListener<String>() {

			@Override
			public void onChanged(
					javafx.collections.ListChangeListener.Change<? extends String> c){
			
				while(c.next()) {
					if(c.wasAdded()) {
						List<? extends String> innerList = c.getAddedSubList();
						for(String s : innerList) {
							System.out.println("Inhalt hinzugefügt: " + s);
						}
					}
					if(c.wasRemoved()) {
						List<? extends String> innerList = c.getRemoved();
						for(String s : innerList ) {
							System.out.println("Inhalt entfernt: " +s);
						}
					}
				}	
			}
		});
		
		o1.add("Berg");
		o1.add("See");
		o1.addAll("Zoo", "Meer", "Tal");
		
		o1.set(0, "Wald");
	}

}

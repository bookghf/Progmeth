package gui;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

//You might need to do something to the following line
public class ItemPane {

	private ObservableList<ItemButton> itemButtonList = FXCollections.observableArrayList();
	
	public ItemPane () {
		// TODO implements the ItemPane's constructor

	} 

	public void setSelectedButton ( ItemButton selecteditemButton ) {
		// TODO set selectedItemButton of SimulationManager to given ItemButton
		// resetButtonsBackgroundColor and the highlight the selecteditemButton
	}

	public void resetButtonsBackGroundColor() {
		// TODO unhighlight each button in itemButtonList
		
	}	
	
}

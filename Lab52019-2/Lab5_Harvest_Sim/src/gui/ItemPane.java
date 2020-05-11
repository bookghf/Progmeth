package gui;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class ItemPane  extends GridPane {

	private ObservableList<ItemButton> itemButtonList = FXCollections.observableArrayList();
	
	public ItemPane () {
		super();
		this.setHgap(10);
		this.setVgap(10);
		this.setAlignment(Pos.CENTER);
		
		itemButtonList.add(new ItemButton("Corn"));
		itemButtonList.add(new ItemButton("Coffee"));
		itemButtonList.add(new ItemButton("Blueberry"));
		itemButtonList.add(new ItemButton("Strawberry"));
		itemButtonList.add(new ItemButton("Pineapple"));
		itemButtonList.add(new ItemButton(""));
		for (ItemButton itemButton : itemButtonList) {
			itemButton.setOnAction(e -> {
				if (SimulationManager.getMoney() >= itemButton.getItem().getPrice())
				setSelectedButton(itemButton);
			});
		}		
		this.addRow(0, itemButtonList.get(0), itemButtonList.get(1), itemButtonList.get(2));
		this.addRow(1, itemButtonList.get(3), itemButtonList.get(4), itemButtonList.get(5));
	} 

	public void setSelectedButton ( ItemButton selecteditemButton ) {
		SimulationManager.setSelectedItemButton(selecteditemButton);
		resetButtonsBackGroundColor();
		selecteditemButton.highlight();
	}

	public void resetButtonsBackGroundColor() {
		for(ItemButton itemButton : itemButtonList) {
			itemButton.unhighlight();
		}
		
	}	
	
}

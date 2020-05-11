package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class FieldPane extends GridPane {
	
	private ObservableList<FieldCell> fieldCells = FXCollections.observableArrayList();
	
	public FieldPane () {
		super();
		this.setHgap(8);
		this.setVgap(8);
		this.setPadding(new Insets(8));
		this.setAlignment(Pos.CENTER);
		this.setPrefWidth(500);
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		this.setBackground(new Background(new BackgroundFill(Color.LIMEGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
		int row = 6;
		int column = 8;
		for(int i = 0 ; i < row*column; i++) {
			fieldCells.add(new FieldCell());			
		}
		
		for(int i = 0 ; i < row; i++) {
			for(int j = 0; j < column; j++) {
				this.add(fieldCells.get(i*column+j), j, i);
			}
		}
	} 
	
	public int calculateIncome() {
		int totalIncome = 0;
		for (FieldCell fieldCell : fieldCells) {
			if (fieldCell.getCrop() != null) {				
				totalIncome += fieldCell.getCrop().getIncome();
			}
		}
		return totalIncome;
	}
	
	
}

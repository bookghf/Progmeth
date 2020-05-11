package gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ControlPane extends VBox {
	
	private ItemPane itemPane;
	private Button harvestButton;
	private Label moneyLabel;
	
	public ControlPane () {
		super(15);
		this.setPrefWidth(300);
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		this.setAlignment(Pos.CENTER);
		this.setFillWidth(true);
		
		itemPane = new ItemPane();
		moneyLabel = new Label();
		moneyLabel.setFont(new Font(20));
		moneyLabel.textProperty().setValue("Money: " + SimulationManager.getMoney());
		
		Label label = new Label("Please select a seed or removal tool");
		label.setFont(new Font(14));
		
		harvestButton = new Button("Harvest");
		harvestButton.setPrefWidth(150);
		harvestButton.setOnAction( e -> {
			SimulationManager.harvestHandler();
			
		});
		this.getChildren().addAll(moneyLabel,label, itemPane, harvestButton);		
	}

	
	public Label getMoneyLabel() {
		return moneyLabel;
	}

	public void setMoneyLabelText() {
		moneyLabel.textProperty().setValue("Money: " + SimulationManager.getMoney());		
	}
	
	
}

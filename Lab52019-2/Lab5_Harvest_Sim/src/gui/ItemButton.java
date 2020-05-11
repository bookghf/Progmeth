package gui;

import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.geometry.Insets;


public class ItemButton extends Button {

	private Item item;

	ItemButton(String itemName){
		super();
		this.setPadding(new Insets(5));
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		this.item = new Item(itemName);		
		Image image = new Image(item.getUrl());		
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(48);
		imageView.setFitWidth(48);
		this.setGraphic(imageView);				

		this.setTooltip();
	}

	public void highlight() {
		this.setBackground(new Background(new BackgroundFill(Color.LIMEGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public void unhighlight() {
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public Item getItem() {
		return item;
	}
	
	private void setTooltip() {
		Tooltip	tooltip = new Tooltip();
		tooltip.setFont(new Font(12));
		tooltip.setText(item.getItemName() + item.getPriceText() + item.getIncomeText());
		this.setOnMouseMoved((MouseEvent e) -> {
			if (item != null)
			tooltip.show(this, e.getScreenX(), e.getScreenY()+10);
		});
		this.setOnMouseExited((MouseEvent e) -> {
			tooltip.hide();
		});		
	}

	

}

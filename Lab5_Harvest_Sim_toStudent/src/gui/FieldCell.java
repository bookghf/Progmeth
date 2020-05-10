package gui;

import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

//You might need to do something to the following line
public class FieldCell{
	
	private Item crop;
	private Tooltip tooltip;

	public FieldCell() {
		// TODO	Complete the FieldCell's constructor

		this.addEventHandler(MouseEvent.MOUSE_CLICKED, 
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent  e) {
						// TODO fill in this method					}
			});
		
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	private void onClickHandler() {
		if(SimulationManager.getSelectedItemButton() != null) {
			Item selectedItem = SimulationManager.getSelectedItemButton().getItem();
			// TODO Complete what have to be done if this cell is clicked 
			//		when a button in ControlPane is selected.
			
		}
	}

	private void setBackgroundSoilColor() {
		this.setBackground(new Background(new BackgroundFill(Color.MOCCASIN, CornerRadii.EMPTY, Insets.EMPTY)));		
	}

	private void setBackgroundSoilColor(Image image) {
		BackgroundFill bgFill = new BackgroundFill(Color.MOCCASIN, CornerRadii.EMPTY, Insets.EMPTY);
		BackgroundFill[] bgFillA = {bgFill};
		BackgroundSize bgSize = new BackgroundSize(48,48,false,false,false,false);
		BackgroundImage bgImg = new BackgroundImage(image, null, null, null, bgSize);
		BackgroundImage[] bgImgA = {bgImg};
		this.setBackground(new Background(bgFillA,bgImgA));
	}
	
	private void setUpTooltip() {
		tooltip = new Tooltip();
		tooltip.setFont(new Font(12));
		this.setOnMouseMoved((MouseEvent e) -> {
			if (crop != null)
			tooltip.show(this, e.getScreenX(), e.getScreenY()+10);
		});
		this.setOnMouseExited((MouseEvent e) -> {
			tooltip.hide();
		});
		
	}
	
	
}

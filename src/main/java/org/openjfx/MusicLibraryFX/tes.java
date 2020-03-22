package org.openjfx.MusicLibraryFX;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class tes extends VBox {
public tes() {
	super();
Button b =new Button("Test");
	this.getChildren().add(b);
	b.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			App.layout.setLeft(new Label("AAA"));
			
		}
	});
	
	// TODO Auto-generated constructor stub
}
}

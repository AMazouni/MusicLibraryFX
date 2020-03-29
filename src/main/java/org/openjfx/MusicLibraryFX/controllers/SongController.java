package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SongController implements Initializable {
    private String label;
    @FXML
    private Label songName;
	public SongController(String label) {
		super();
		this.label = label;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		songName.setText(label);
		
	}
    
    

}
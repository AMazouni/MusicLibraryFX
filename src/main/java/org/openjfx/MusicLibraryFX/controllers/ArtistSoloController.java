package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class ArtistSoloController implements Initializable{
	@FXML
	private Circle circleImage;

	@FXML
	private Label artistName;
	
	private String name;
	
	public ArtistSoloController(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Image image = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ name + ".jpg");
		artistName.setText(name);
		circleImage.setFill(new ImagePattern(image));
	}
	
	
}

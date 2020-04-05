package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;

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
	
	private Artist artist;
	
	public ArtistSoloController(Artist artist) {
		// TODO Auto-generated constructor stub
		this.artist = artist;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Image image = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ artist.getPortrait());
		
		artistName.setText(artist.getName());
		circleImage.setFill(new ImagePattern(image));
	}
	
	
}

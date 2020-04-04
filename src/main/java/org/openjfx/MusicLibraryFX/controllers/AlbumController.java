package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.retrofit.beans.Album;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AlbumController  implements Initializable{
	@FXML
	private ImageView albumImage;

	@FXML
	private Label albumName;

	@FXML
	private Label artistName;
	
	private Album album;
	
	public AlbumController(Album album) {
		// TODO Auto-generated constructor stub
		this.album = album;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		albumName.setText(album.getLibelle());
		artistName.setText(album.getArtist().getName());
		Image image = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ album.getArtist().getName() + ".jpg");
		albumImage.setImage(image);
	}
}

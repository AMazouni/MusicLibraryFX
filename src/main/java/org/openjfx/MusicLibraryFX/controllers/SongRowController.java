package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class SongRowController implements Initializable {

private String songname;
private String artistName;
private String albumName;
private String genre;

	@FXML
    private HBox songRow;

    @FXML
    private Button songButton;

    @FXML
    private Label songLabel;

    @FXML
    private Label songArtist;

    @FXML
    private Label songAlbum;

    @FXML
    private Label songGenre;

    @FXML
    void SongButtonClick(ActionEvent event) {

    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
    	songLabel.setText(songname);
    	songArtist.setText(artistName);
    	songAlbum.setText(albumName);
    	songGenre.setText(genre);
		
	}

	public SongRowController(String songname, String artistName, String albumName, String genre) {
		super();
		this.songname = songname;
		this.artistName = artistName;
		this.albumName = albumName;
		this.genre = genre;
	}

}

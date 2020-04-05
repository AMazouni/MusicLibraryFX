package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class SongRowController implements Initializable {
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
    
    private Song song;
    
    private SongListController songListController;

    @FXML
    void SongButtonClick(ActionEvent event) {

    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
    	songLabel.setText(song.getLibelle());
    	songArtist.setText(song.getArtist().getName());
    	songAlbum.setText(song.getAlbum().getLibelle());
    	songGenre.setText(song.getGenre().getLibelle());
		
	}

	public SongRowController(Song song,SongListController songListController) {
		super();
		this.song = song;
		this.songListController = songListController;
	}
	
	public void OnClick () {
		try {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(App.class.getResource("views/Song.fxml"));
		loader.setController(new SongController(song));
		Parent node = loader.load();
		node.prefWidth(songRow.getWidth());
		songListController.getStackpaneSongList().getChildren().add(node);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	
	}
	
	
}

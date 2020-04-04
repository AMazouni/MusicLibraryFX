package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SongController implements Initializable {
    private Song song;
    @FXML
    private Label songName;

    @FXML
    private Label artistName;

    @FXML
    private Label genreName;

    @FXML
    private Label releaseDate;

    @FXML
    private TextField lyrics;
    
    @FXML
    private ImageView songAlbumImage;
	public SongController(Song song) {
		super();
		this.song = song;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		songName.setText(song.getLibelle());
		artistName.setText(song.getArtist().getName());
		genreName.setText(song.getGenre().getLibelle());
		releaseDate.setText(song.getReleaseDate().toString());
		String [] actualleLyrics = song.getLyrics();
		String text = actualleLyrics[0];
		for (int i = 1; i < actualleLyrics.length; i++) {
			text = text + " \n " + actualleLyrics[i];
		}
		lyrics.setText(text);
		Image image = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ song.getAlbum().getPicture());
		songAlbumImage.setImage(image);
	}
}
package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SongController implements Initializable {
    private Song song;
    @FXML
    private Label songName;
	public SongController(Song song) {
		super();
		this.song = song;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		songName.setText(song.getLibelle());
	}
}
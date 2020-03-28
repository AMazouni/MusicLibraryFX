package org.openjfx.MusicLibraryFX.controllers;


import java.io.IOException;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Song;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.SongServiceImpl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;

public class MainController {
	@FXML
    private Tab SongsButton;
	
	@FXML
    void SongsButton(ActionEvent event) throws IOException {
		SongServiceImpl songServiceImpl = new SongServiceImpl();
		List<Song> songs = songServiceImpl.findAll();
		SongListController songListController = new SongListController();
		songListController.genereateSongList(songs);
    }
}

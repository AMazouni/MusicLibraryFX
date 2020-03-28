package org.openjfx.MusicLibraryFX.controllers;

import java.util.Date;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class SongListController {
	@FXML
	private TableColumn<Song, String> Libelle;
	@FXML
	private TableColumn<Song, Artist> artist;
	@FXML
	private TableColumn<Song, Album> album;
	@FXML
	private TableColumn<Song, Date> ReleaseDate;
	
    @FXML
    private TableView<Song> TableView;

    @FXML
    private Button Reload;

    @FXML
    void ReloadList(MouseEvent event) {
  
    }
    
    public void genereateSongList (List<Song> songs) {
    	Libelle.setCellValueFactory(new PropertyValueFactory<>("libelle"));
    	artist.setCellValueFactory(new PropertyValueFactory<>("artist"));
    	album.setCellValueFactory(new PropertyValueFactory<>("album"));
    	ReleaseDate.setCellValueFactory(new PropertyValueFactory<>("releaseDate"));
		for (Song song : songs) {
			TableView.getItems().add(song);
		}
		
    }
}
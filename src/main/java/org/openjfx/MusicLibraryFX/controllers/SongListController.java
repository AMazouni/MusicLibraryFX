package org.openjfx.MusicLibraryFX.controllers;

import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class SongListController {

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> Libelle;

    @FXML
    private TableColumn<?, ?> artist;

    @FXML
    private TableColumn<?, ?> album;

    @FXML
    private TableColumn<?, ?> ReleaseDate;

    @FXML
    private Button Reload;

    @FXML
    void ReloadList(MouseEvent event) {

    }
    
    public void genereateSongList (List<Song> songs) {
    	/*Libelle.setCellValueFactory(new PropertyValueFactory<>("libelle"));
    	artist.setCellValueFactory(new PropertyValueFactory<>("artist"));
    	album.setCellValueFactory(new PropertyValueFactory<>("album"));
    	ReleaseDate.setCellValueFactory(new PropertyValueFactory<>("releaseDate"));
		for (Song song : songs) {
			tableView.getItems().add(song);
		}
		*/
    }
}
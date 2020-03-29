package org.openjfx.MusicLibraryFX.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class SongListController {

    @FXML
    private StackPane stackpane;

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
    	System.out.println( App.class.getResource("views/Song.fxml"));
   try {
	   FXMLLoader loader = new FXMLLoader();

	   loader.setLocation( App.class.getResource("views/Song.fxml"));
	   loader.setController(new SongController("TEST"));
	  
	   Parent node = loader.load();
	   stackpane.getChildren().add(stackpane.getChildren().size(),node );
	  
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}    }
    
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
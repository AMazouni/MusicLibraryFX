package org.openjfx.MusicLibraryFX.controllers;



import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;

import org.openjfx.MusicLibraryFX.retrofit.beans.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class SongListController implements Initializable {

	 private List<Song> listSong;
    @FXML
    private StackPane stackpaneSongList;

    @FXML
    private ScrollPane scrollPaneSongList;

    @FXML
    private VBox songsVBox;

    @FXML
    private Button reloadButton;

    @FXML
    void reloadSongList(ActionEvent event) {
    	/*System.out.println( App.class.getResource("views/Song.fxml"));
   try {
	   FXMLLoader loader = new FXMLLoader();

	   loader.setLocation( App.class.getResource("views/Song.fxml"));
	   loader.setController(new SongController("TEST"));
	  
	   Parent node = loader.load();
	   stackpaneSongList.getChildren().add( );
	  
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}  */ }
    
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

	public SongListController(List<Song> listSong) {
		super();
		this.listSong = listSong;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		try {
			for(Song song : listSong){
 		   FXMLLoader loader = new FXMLLoader();

 		   loader.setLocation( App.class.getResource("views/SongRow.fxml"));
 		   loader.setController(new SongRowController(song.getLibelle(), song.getArtist().getName(), song.getAlbum().getLibelle(), "ROCK"));
 		  
 		   Parent node = loader.load();
 		   songsVBox.getChildren().add(node);
 		   }
 		  
 	} catch (IOException e) {
 		e.printStackTrace();
 	}
		
	}
}
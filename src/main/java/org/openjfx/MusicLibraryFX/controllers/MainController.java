package org.openjfx.MusicLibraryFX.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {
 private List<Song> listSongs;
 private List<Album> listAlbum;
 private List<PlayList> listPlayList;
 private List<Artist> listArtist;
 String SongName;
 

	public MainController(List<Song> listSongs, List<Album> listAlbum, List<PlayList> listPlayList,
		List<Artist> listArtist,String SongName) {
	super();
	this.listSongs = listSongs;
	this.listAlbum = listAlbum;
	this.listPlayList = listPlayList;
	this.listArtist = listArtist;
	this.SongName = SongName;
}

	@FXML
    private BorderPane borderPaneRoot;

    @FXML
    private AnchorPane playerAnchorContainer;

    @FXML
    private AnchorPane songTabAnchor;
    
    @FXML
    private TabPane tabPane;

    @FXML
    private Tab songTab;

    @FXML
    private Tab AlbumTab;

    @FXML
    private Tab playListsTab;

    @FXML
    private Tab artistsTab;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	try {
    		   FXMLLoader loader = new FXMLLoader();

    		   loader.setLocation( App.class.getResource("views/SongList.fxml"));
    		   loader.setController(new SongListController(listSongs));
    		  
    		   Parent node = loader.load();
    		  songTabAnchor.getChildren().add(node);
    		   songTabAnchor.setTopAnchor(node, 0d);
    		   songTabAnchor.setBottomAnchor(node, 0d);
    		   songTabAnchor.setRightAnchor(node, 0d);
    		   songTabAnchor.setLeftAnchor(node, 0d);
    		
    		   
    		
    		   FXMLLoader loader2 = new FXMLLoader();
    		   loader2.setLocation( App.class.getResource("views/Player.fxml"));
    		   loader2.setController(new PlayerController(SongName));
    		   Parent node2 = loader2.load();
    		   
    		   borderPaneRoot.setBottom(node2);
    		   
    		  
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
		
	}

}

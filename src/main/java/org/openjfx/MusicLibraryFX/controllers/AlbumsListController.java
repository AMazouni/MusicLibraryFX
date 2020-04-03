package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.retrofit.beans.Album;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

public class AlbumsListController implements Initializable {
	
	    private List<Album> listAlbum;
	    
	    @FXML
	    private StackPane stackpaneAlbumList;

	    @FXML
	    private ScrollPane scrollPaneSongList;

	    @FXML
	    private FlowPane albumFlowPane;

	    @FXML
	    private Button reloadButton;

	    public AlbumsListController(List<Album> listAlbum) {
			this.listAlbum=listAlbum;
		}

		@FXML
	    void reloadSongList(ActionEvent event) {

	    }

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
		   
			
		}
		
		
}

package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

public class AlbumsListController implements Initializable {
	
	    private List<Album> listAlbum;
	    
	    @FXML
	    private StackPane stackpaneAlbums;

	    @FXML
	    private ScrollPane scrollPaneAlbums;

	    @FXML
	    private FlowPane albumsFlowPane;

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
		
			try {
			for (Album album : listAlbum) {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(App.class.getResource("views/Album.fxml"));
				loader.setController(new AlbumController(album,this));
				Parent node = loader.load();
				albumsFlowPane.setHgap(30);
				albumsFlowPane.setVgap(30);
				albumsFlowPane.getChildren().add(node);
			}
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}

		public List<Album> getListAlbum() {
			return listAlbum;
		}

		public void setListAlbum(List<Album> listAlbum) {
			this.listAlbum = listAlbum;
		}

		public StackPane getStackpaneAlbums() {
			return stackpaneAlbums;
		}

		public void setStackpaneAlbums(StackPane stackpaneAlbums) {
			this.stackpaneAlbums = stackpaneAlbums;
		}

		public ScrollPane getScrollPaneAlbums() {
			return scrollPaneAlbums;
		}

		public void setScrollPaneAlbums(ScrollPane scrollPaneAlbums) {
			this.scrollPaneAlbums = scrollPaneAlbums;
		}

		public FlowPane getAlbumsFlowPane() {
			return albumsFlowPane;
		}

		public void setAlbumsFlowPane(FlowPane albumsFlowPane) {
			this.albumsFlowPane = albumsFlowPane;
		}

		public Button getReloadButton() {
			return reloadButton;
		}

		public void setReloadButton(Button reloadButton) {
			this.reloadButton = reloadButton;
		}
		
		
}

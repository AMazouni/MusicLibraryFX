package org.openjfx.MusicLibraryFX.controllers;


	import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.AlbumServiceImpl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


	public class AlbumPageController implements Initializable {
	    @FXML
	    private ImageView albumImageView;

	    @FXML
	    private Label albumNameLabel;

	    @FXML
	    private Label artistNameLabel;

	    @FXML
	    private AnchorPane albumSongsAnchor;
	   
	    @FXML
	    private SplitPane splitPane;
	    
	    @FXML
	    private Button exitButton;
	    
	    private Album album;
	    

	  
	    
		public AlbumPageController(Album album) {
			super();
			this.album = album;
		}



		@Override
		public void initialize(URL location, ResourceBundle resources) {
			albumNameLabel.setText(album.getLibelle());
			artistNameLabel.setText(album.getArtist().getName());
			albumImageView.setImage(new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ album.getPicture()));
			AlbumServiceImpl albumService= new AlbumServiceImpl();
			try {
				List<Song> listSong=albumService.ListSongsByLibelle(album.getLibelle());
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(App.class.getResource("views/SongList.fxml"));
				loader.setController(new SongListController(listSong));
				Parent node = loader.load();
		
				albumSongsAnchor.getChildren().add(node);
				albumSongsAnchor.setBottomAnchor(node, 0d);
				albumSongsAnchor.setTopAnchor(node, 0d);
				albumSongsAnchor.setRightAnchor(node, 0d);
				albumSongsAnchor.setLeftAnchor(node, 0d);	  
			} catch (IOException e) {
			javafx.scene.control.TextField Error = new javafx.scene.control.TextField("Error Getting Song List : "+e.getMessage());
			albumSongsAnchor.getChildren().add(Error);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	    @FXML
	    void exit(ActionEvent event) {
        this.splitPane.setVisible(false);
	    }

	}

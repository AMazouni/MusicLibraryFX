package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class AlbumController  implements Initializable{
	@FXML
	private ImageView albumImage;

	@FXML
	private Label albumName;

	@FXML
	private Label artistName;
	
	private Album album;
	
	private AlbumsListController ParentController;
	public AlbumController(Album album,AlbumsListController ParentController) {
		// TODO Auto-generated constructor stub
		this.album = album;
		this.ParentController=ParentController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		albumName.setText(album.getLibelle());
		artistName.setText(album.getArtist().getName());
		Image image = new Image("file:\\" +System.getProperty("user.dir") + "\\UIImages\\"+ album.getPicture());
		albumImage.setImage(image);
	}
    @FXML
    void LoadAlbum(MouseEvent event) {
    	try {
			
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(App.class.getResource("views/AlbumPage.fxml"));
				loader.setController(new AlbumPageController(album));
				Parent node = loader.load();
				
				ParentController.getStackpaneAlbums().getChildren().add(node);
			
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
    }
}

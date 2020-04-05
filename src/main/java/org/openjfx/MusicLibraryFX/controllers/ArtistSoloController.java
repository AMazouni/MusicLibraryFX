package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.AlbumServiceImpl;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.SongServiceImpl;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class ArtistSoloController implements Initializable{
	@FXML
	private Circle circleImage;

	@FXML
	private Label artistName;
	
	private Artist artist;
	
	private ArtistSoloDeployementController artistSoloDeployementController;
	
	public ArtistSoloController(Artist artist,ArtistSoloDeployementController artistSoloDeployementController) {
		// TODO Auto-generated constructor stub
		this.artist = artist;
		this.artistSoloDeployementController = artistSoloDeployementController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Image image = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ artist.getPortrait());
		
		artistName.setText(artist.getName());
		circleImage.setFill(new ImagePattern(image));
	}
	
	public void OnClick () {
		SongServiceImpl songServiceImpl = new SongServiceImpl();
		AlbumServiceImpl albumServiceImpl = new AlbumServiceImpl();
		try {
			FXMLLoader loader = new FXMLLoader();
			List<Song> listSong = songServiceImpl.findByArtistId(artist.getId());
			List<Album> listAlbum = albumServiceImpl.findByArtistId(artist.getId());
			loader.setLocation( App.class.getResource("views/ArtistWithLists.fxml"));
			loader.setController(new ArtistWithListsController(artist,new SongListController(listSong),new AlbumsListController(listAlbum)));
			System.out.println(listSong);
			System.out.println(listAlbum);
			Parent node = loader.load();
			artistSoloDeployementController.getStackpaneArtists().getChildren().add(node);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
	
}

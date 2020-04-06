package org.openjfx.MusicLibraryFX.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.AlbumServiceImpl;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.ArtistServiceImpl;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.SongServiceImpl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class ArtistWithListsController implements Initializable {

	@FXML
	private Circle artistImage;

	@FXML
	private Label artistName;

	@FXML
	private ScrollPane scrollPane;

	@FXML
	private FlowPane flowPane;

	@FXML
	private StackPane stackPane;

	@FXML
	private StackPane stackPane2;

	@FXML
	private Button exitButton;

	@FXML
	private AnchorPane anchorPane;

	private Artist artist;

	private SongListController songListController;

	private AlbumsListController albumsListController;

	public ArtistWithListsController(Artist artist, SongListController songListController,
			AlbumsListController albumsListController) {
		// TODO Auto-generated constructor stub
		this.artist = artist;
		this.songListController = songListController;
		this.albumsListController = albumsListController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		artistName.setText(artist.getName());
		Image image = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\" + artist.getPortrait());
		artistImage.setFill(new ImagePattern(image));
		SongServiceImpl songServiceImpl = new SongServiceImpl();
		AlbumServiceImpl albumServiceImpl = new AlbumServiceImpl();
		try {
			List<Song> songs = songServiceImpl.findByArtistId(artist.getId());
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(App.class.getResource("views/SongList.fxml"));
			loader.setController(new SongListController(songs));
			Parent node = loader.load();
			stackPane.getChildren().add(node);
			List<Album> albums = albumServiceImpl.findByArtistId(artist.getId());
			FXMLLoader loader2 = new FXMLLoader();
			loader2.setLocation(App.class.getResource("views/AlbumList.fxml"));
			loader2.setController(new AlbumsListController(albums));
			Parent node2 = loader2.load();
			stackPane2.getChildren().add(node2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void exit(ActionEvent event) {
		this.anchorPane.setVisible(false);
	}

}

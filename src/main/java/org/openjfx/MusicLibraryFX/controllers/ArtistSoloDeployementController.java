package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

public class ArtistSoloDeployementController implements Initializable {
	@FXML
	private StackPane stackpaneArtists;

	@FXML
	private ScrollPane scrollPaneArtists;

	@FXML
	private FlowPane artistsFlowPane;

	private List<Artist> artists;
	
	@FXML
    private Button reloadButton;
	
	@FXML
    void reloadSongList(ActionEvent event) {

    }

	public ArtistSoloDeployementController(List<Artist> artists) {
		// TODO Auto-generated constructor stub
		this.artists = artists;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			for (Artist artist : artists) {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(App.class.getResource("views/ArtistSolo.fxml"));
				loader.setController(new ArtistSoloController(artist));
				Parent node = loader.load();
				artistsFlowPane.setHgap(30);
				artistsFlowPane.setVgap(30);
				artistsFlowPane.getChildren().add(node);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

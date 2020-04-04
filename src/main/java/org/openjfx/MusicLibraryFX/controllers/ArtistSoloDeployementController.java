package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

public class ArtistSoloDeployementController implements Initializable{
	@FXML
    private FlowPane flowPane;
	
	@FXML
    private StackPane stackPane;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ScrollPane scrollPane;
    
    private List<Artist> artists;
	
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
			loader.setController(new ArtistSoloController(artist.getName()));
			Parent node = loader.load();
			flowPane.setHgap(30);
			flowPane.setVgap(30);
			flowPane.getChildren().add(node);
			
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

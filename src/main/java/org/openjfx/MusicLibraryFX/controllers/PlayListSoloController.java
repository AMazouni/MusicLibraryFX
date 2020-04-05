package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class PlayListSoloController implements Initializable{
	@FXML
    private ImageView playListImage;

    @FXML
    private Label playListName;
    
    @FXML
    private VBox playListVbox;
    
    private PlayList playList;
    
    private PlayListsController playListsController;
    
    public PlayListSoloController(PlayList playList,PlayListsController playListsController) {
		// TODO Auto-generated constructor stub
    	this.playList = playList;
    	this.playListsController = playListsController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		playListName.setText(playList.getLibelle());
		playListImage.setImage(new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ "GenericPlayListIcon.JPG"));
	}
	
	public void OnClick () {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(App.class.getResource("views/PlayList.fxml"));
			loader.setController(new PlayListController(playList));
			Parent node = loader.load();
			playListsController.getStackpanePlayLists().getChildren().add(node);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
    
}

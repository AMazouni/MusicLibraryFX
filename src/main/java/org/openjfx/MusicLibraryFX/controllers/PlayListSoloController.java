package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    
    public PlayListSoloController(PlayList playList) {
		// TODO Auto-generated constructor stub
    	this.playList = playList;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		playListName.setText(playList.getLibelle());
		playListImage.setImage(new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ "arctic monkeys" + ".jpg"));
	}
	
	public void ClickOnPlayList () {
		
	}
    
}

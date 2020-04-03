package org.openjfx.MusicLibraryFX.controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import org.openjfx.MusicLibraryFX.App;
import javafx.scene.media.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

public class PlayerController implements Initializable{
	@FXML
	private ImageView songImage;

	@FXML
	private Label songNameLabel;

	@FXML
	private Label artistNameLabel;

	@FXML
	private Label InitialTimerLabel;

	@FXML
	private ProgressBar ProgressBar;

	@FXML
	private Label FinalTimerLabel;

	@FXML
	private Button backwardButton;

	@FXML
	private Button playButton;

	@FXML
	private Button forwardButton;
	
	String SongName;
	
	public PlayerController(String SongName) {
		this.SongName = SongName;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			File file = new File("file:\\" + System.getProperty("user.dir") + "\\Songs\\" + SongName + ".mp3");
			// if you try an Sout here , i will work 
			// it will not work here , try Sout(file) .
     javafx.scene.media.Media media= new javafx.scene.media.Media(file.toURI().toString()) ;
     MediaPlayer mediaPlayer = new MediaPlayer(media);
     mediaPlayer.setAutoPlay(true);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}

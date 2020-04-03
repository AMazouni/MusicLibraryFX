package org.openjfx.MusicLibraryFX.controllers;

import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import org.openjfx.MusicLibraryFX.App;

import com.goxr3plus.streamplayer.stream.StreamPlayer;
import com.goxr3plus.streamplayer.stream.StreamPlayerEvent;
import com.goxr3plus.streamplayer.stream.StreamPlayerListener;

import javafx.scene.media.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

public class PlayerController extends StreamPlayer implements Initializable,StreamPlayerListener{
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
		open(new File(System.getProperty("user.dir") + "\\Songs\\" + "MP3Test.mp3"));
		play();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Override
	public void opened(Object dataSource, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void progress(int nEncodedBytes, long microsecondPosition, byte[] pcmData, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void statusUpdated(StreamPlayerEvent event) {
		// TODO Auto-generated method stub
		
	}

}

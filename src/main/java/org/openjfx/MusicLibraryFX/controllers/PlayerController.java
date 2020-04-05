package org.openjfx.MusicLibraryFX.controllers;

import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.Observable;
import java.util.ResourceBundle;


import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;


import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import com.goxr3plus.streamplayer.enums.Status;
import com.goxr3plus.streamplayer.stream.StreamPlayer;
import com.goxr3plus.streamplayer.stream.StreamPlayerEvent;
import com.goxr3plus.streamplayer.stream.StreamPlayerListener;

import javafx.scene.media.*;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
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
	
	Song song;
	
	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
		this.stop();
		try {
		    addStreamPlayerListener(this);
			open(new File(System.getProperty("user.dir") + "\\Songs\\" + "MP3Test.mp3"));	
			play();
			
		    
			} catch (Exception e) {
				e.getStackTrace();
			}

	}

	public PlayerController(Song song) {
		this.song = song;
		try {
		    addStreamPlayerListener(this);
			open(new File(System.getProperty("user.dir") + "\\Songs\\" + "MP3Test.mp3"));	
			play();
			
		    
			} catch (Exception e) {
				e.getStackTrace();
			}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
	    addStreamPlayerListener(this);
		open(new File(System.getProperty("user.dir") + "\\Songs\\" + "MP3Test.mp3"));	
		play();
	
	    
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Override
	public void opened(Object dataSource, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		songImage.setImage(new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\"+ song.getAlbum().getPicture()));
		artistNameLabel.setText(song.getArtist().getName());
		songNameLabel.setText(song.getLibelle());
		FinalTimerLabel.setText(Integer.toString(this.getDurationInSeconds()/60)+"::"+Integer.toString(this.getDurationInSeconds()%60));
		InitialTimerLabel.setText("00:00");


		
	}
	private String Position="00:00";
	

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
		InitialTimerLabel.setText(Position);
	}


	@Override
	public void progress(int nEncodedBytes, long microsecondPosition, byte[] pcmData, Map<String, Object> properties) {
		// TODO Auto-generated method stub
    Platform.runLater(()->setPosition(Long.toString(microsecondPosition/60000000l-((microsecondPosition/6000000000l)*100))+":"+Long.toString(microsecondPosition/1000000l-((microsecondPosition/100000000l)*100))));
	

	}

	@Override
	public void statusUpdated(StreamPlayerEvent event) {
		// TODO Auto-generated method stub
		// Player status
        final Status status = event.getPlayerStatus();
         System.out.println(event.getPlayerStatus()+"TEST");

        // Examples

        if (status == Status.OPENED) {
        	
        } else if (status == Status.OPENING) {

        } else if (status == Status.RESUMED) {

        } else if (status == Status.PLAYING) {
        	
        } else if (status == Status.STOPPED) {

        } else if (status == Status.SEEKING) {

        } else if (status == Status.SEEKED) {

        }
	}

}

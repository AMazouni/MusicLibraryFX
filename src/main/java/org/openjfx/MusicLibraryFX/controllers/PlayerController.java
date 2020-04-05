package org.openjfx.MusicLibraryFX.controllers;

import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import com.goxr3plus.streamplayer.enums.Status;
import com.goxr3plus.streamplayer.stream.StreamPlayer;
import com.goxr3plus.streamplayer.stream.StreamPlayerEvent;
import com.goxr3plus.streamplayer.stream.StreamPlayerListener;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PlayerController extends StreamPlayer implements Initializable, StreamPlayerListener {
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
			stop();
			reset();
			songImage.setImage(
					new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\" + song.getAlbum().getPicture()));
			artistNameLabel.setText(song.getArtist().getName());
			songNameLabel.setText(song.getLibelle());
			FinalTimerLabel.setText(Integer.toString(this.getDurationInSeconds() / 60) + ":"
					+ Integer.toString(this.getDurationInSeconds() % 60));
			InitialTimerLabel.setText("00:00");
			ProgressBar.setProgress(0d);
			open(new File(System.getProperty("user.dir") + "\\Songs\\" + song.getSongPath()));
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
		songImage.setImage(
				new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\" + song.getAlbum().getPicture()));
		artistNameLabel.setText(song.getArtist().getName());
		songNameLabel.setText(song.getLibelle());
		FinalTimerLabel.setText(Integer.toString(this.getDurationInSeconds() / 60) + ":"
				+ Integer.toString(this.getDurationInSeconds() % 60));
		InitialTimerLabel.setText("00:00");
		ProgressBar.setProgress(0d);

	}
    Long SeekValue = 0l;
	private Long microsecondPosition = 0l;

	public Long getmicrosecondPosition() {
		return microsecondPosition;
	}

	public void setmicrosecondPosition(Long microsecondPosition) {
		microsecondPosition= microsecondPosition+SeekValue;
		this.microsecondPosition = microsecondPosition;
		InitialTimerLabel.setText(String.format("%02d", microsecondPosition / 60000000l - ((microsecondPosition / 6000000000l) * 100)) + ":"
				+ String.format("%02d",microsecondPosition / 1000000l - ((microsecondPosition / 100000000l) * 100)));
		ProgressBar.setProgress((double)microsecondPosition/(1000000d*(double)this.getDurationInSeconds()));
		
	}

	@Override
	public void progress(int nEncodedBytes, long microsecondPosition, byte[] pcmData, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		Platform.runLater(() -> setmicrosecondPosition(microsecondPosition)
				);
	

	}
  
	@Override
	public void statusUpdated(StreamPlayerEvent event) {
		// TODO Auto-generated method stub
		// Player status
		final Status status = event.getPlayerStatus();
		System.out.println(event.getPlayerStatus() + "TEST");

		// Examples

		if (status == Status.OPENED) {

		} else if (status == Status.OPENING) {

		} else if (status == Status.RESUMED) {
			

		} else if (status == Status.PLAYING) {
			playButton.setText("Pause");
		} else if (status == Status.STOPPED) {
			playButton.setText("Play");

		} else if (status == Status.SEEKING) {

		} else if (status == Status.SEEKED) {

		}
	}

    @FXML
    void seekBackwardAction(ActionEvent event) {
    	try {
    		SeekValue= (SeekValue>10000000l) ? SeekValue-10000000l:0;
			this.seekTo((int)((getmicrosecondPosition()-10000000l)/1000000l));
			System.out.println((int)(getmicrosecondPosition()-10000000l));
			if(getmicrosecondPosition()*1000000l < getDurationInSeconds()) {
				System.out.println(getmicrosecondPosition());}
			else {
				System.out.println(getmicrosecondPosition()+">"+getDurationInSeconds());
				setmicrosecondPosition(getDurationInSeconds()*1000000l);}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		}
    }

    @FXML
    void seekForwardAction(ActionEvent event) {
    	try {
    		SeekValue=SeekValue+10000000l;
			this.seekSeconds(10);
			if((int)(getmicrosecondPosition()/1000000l) < getDurationInSeconds()) {
				System.out.println(getmicrosecondPosition());}
			else {
				System.out.println(getmicrosecondPosition()+">"+getDurationInSeconds());
				setmicrosecondPosition(getDurationInSeconds()*1000000l);}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		}
    }

    @FXML
    void playAction(ActionEvent event) {
  if(this.getStatus()==this.getStatus().PLAYING) {
	  playButton.setText("Resume");
	  this.pause();
  } else if (this.getStatus()==this.getStatus().PAUSED) {
	  this.resume();
	  playButton.setText("Pause");
  }
    }


}

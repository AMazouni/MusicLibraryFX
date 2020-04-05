package org.openjfx.MusicLibraryFX.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

public class PlayListsController implements Initializable{
	    @FXML
	    private StackPane stackpanePlayLists;

	    @FXML
	    private ScrollPane scrollPanePlayLists;

	    @FXML
	    private FlowPane playListFlowPane;

	    @FXML
	    private Button reloadButton;

	    @FXML
	    void reloadSongList(ActionEvent event) {

	    }
	    
	    List<PlayList> playLists;
	    
	    public PlayListsController(List<PlayList> playLists) {
			// TODO Auto-generated constructor stub
	    	this.playLists = playLists;
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			try {
			for (PlayList playList : playLists) {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(App.class.getResource("views/PlayListSolo.fxml"));
				loader.setController(new PlayListSoloController(playList,this));
				Parent node = loader.load();
				playListFlowPane.setHgap(30);
				playListFlowPane.setVgap(30);
				playListFlowPane.getChildren().add(node);
			}
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}

		public StackPane getStackpanePlayLists() {
			return stackpanePlayLists;
		}

		public void setStackpanePlayLists(StackPane stackpanePlayLists) {
			this.stackpanePlayLists = stackpanePlayLists;
		}

		public ScrollPane getScrollPanePlayLists() {
			return scrollPanePlayLists;
		}

		public void setScrollPanePlayLists(ScrollPane scrollPanePlayLists) {
			this.scrollPanePlayLists = scrollPanePlayLists;
		}

		public FlowPane getPlayListFlowPane() {
			return playListFlowPane;
		}

		public void setPlayListFlowPane(FlowPane playListFlowPane) {
			this.playListFlowPane = playListFlowPane;
		}

		public Button getReloadButton() {
			return reloadButton;
		}

		public void setReloadButton(Button reloadButton) {
			this.reloadButton = reloadButton;
		}

		public List<PlayList> getPlayLists() {
			return playLists;
		}

		public void setPlayLists(List<PlayList> playLists) {
			this.playLists = playLists;
		}
		
	    
}

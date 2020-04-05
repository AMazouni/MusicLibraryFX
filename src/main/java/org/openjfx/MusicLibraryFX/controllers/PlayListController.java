package org.openjfx.MusicLibraryFX.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import com.gluonhq.charm.glisten.control.Avatar;
import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.PlayListServiceImpl;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl.SongServiceImpl;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class PlayListController implements Initializable{
	@FXML
    private SplitPane splitPane;

    @FXML
    private AnchorPane anchorPane1;

    @FXML
    private VBox vbox1;

    @FXML
    private ImageView playListImage;

    @FXML
    private Label playListName;

    @FXML
    private HBox hbox1;

    @FXML
    private ImageView addImage;

    @FXML
    private Label addSongLabel;

    @FXML
    private HBox hbox2;

    @FXML
    private ImageView renameImage;

    @FXML
    private Label edtiLabel;

    @FXML
    private HBox hbox3;

    @FXML
    private ImageView deleteImage;

    @FXML
    private Label deleteLabel;

    @FXML
    private AnchorPane anchorPane;
    
    private PlayList playList;
    
    public PlayListController(PlayList playlist) {
		// TODO Auto-generated constructor stub
    	this.playList = playlist;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		playListImage.setImage(new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\" + "GenericPlayListIcon.JPG"));
		Image add = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\" + "add.png");
		Image edit = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\" + "edit2.JPG");
		Image delete = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\" + "delete.JPG");
		addImage.setImage(add);
		renameImage.setImage(edit);
		deleteImage.setImage(delete);
		playListName.setText(playList.getLibelle());

			try {PlayListServiceImpl playListServiceImpl = new PlayListServiceImpl();
		
		System.out.println(playList.getLibelle());
		List<Song> songs = playListServiceImpl.ListSongsByLibelle(playList.getLibelle()); 
		
		System.out.println(songs);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(App.class.getResource("views/SongList.fxml"));
		loader.setController(new SongListController(songs));
		Parent node = loader.load();
		anchorPane.getChildren().add(node);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

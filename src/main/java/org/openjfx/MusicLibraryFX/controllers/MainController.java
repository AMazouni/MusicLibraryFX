package org.openjfx.MusicLibraryFX.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.MusicLibraryFX.App;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class MainController implements Initializable {
 private List<Song> listSongs;
 private List<Album> listAlbum;
 private List<PlayList> listPlayList;
 private List<Artist> listArtist;
 String SongName;
 

	public MainController(List<Song> listSongs, List<Album> listAlbum, List<PlayList> listPlayList,
		List<Artist> listArtist,String SongName) {
	super();
	this.listSongs = listSongs;
	this.listAlbum = listAlbum;
	this.listPlayList = listPlayList;
	this.listArtist = listArtist;
	this.SongName = SongName;
}

	@FXML
    private BorderPane borderPaneRoot;

    @FXML
    private AnchorPane playerAnchorContainer;

    @FXML
    private AnchorPane songTabAnchor;
    
    @FXML
    private TabPane tabPane;

    @FXML
    private Tab songTab;

    @FXML
    private Tab AlbumTab;

    @FXML
    private Tab playListsTab;

    @FXML
    private Tab artistsTab;
    
    @FXML
    private AnchorPane artistsTabAnchor;
    
    @FXML
    private AnchorPane playListTabAnchor;

    @FXML
    private AnchorPane albumTabAnchor;
    
    @FXML
    private FlowPane flowPane;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	try {
    		   FXMLLoader loader = new FXMLLoader();

    		   loader.setLocation( App.class.getResource("views/SongList.fxml"));
    		   loader.setController(new SongListController(listSongs));
    		  
    		   Parent node = loader.load();
    		  songTabAnchor.getChildren().add(node);
    		   songTabAnchor.setTopAnchor(node, 0d);
    		   songTabAnchor.setBottomAnchor(node, 0d);
    		   songTabAnchor.setRightAnchor(node, 0d);
    		   songTabAnchor.setLeftAnchor(node, 0d);
    		   List<Artist> listArtists = new ArrayList<Artist>();
    		   Artist artist1 = new Artist((long) 1, "arctic monkeys", null, null, null);
    		   Artist artist2 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist3 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist4 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist5 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist6 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist7 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist8 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist9 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist10 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist11 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   Artist artist12 = new Artist((long) 2, "arctic monkeys", null, null, null);
    		   listArtists.add(artist1);
    		   listArtists.add(artist2);
    		   listArtists.add(artist3);
    		   listArtists.add(artist4);
    		   listArtists.add(artist5);
    		   listArtists.add(artist6);
    		   listArtists.add(artist7);
    		   listArtists.add(artist8);
    		   listArtists.add(artist9);
    		   listArtists.add(artist10);
    		   listArtists.add(artist11);
    		   listArtists.add(artist12);
    		   FXMLLoader loader3 = new FXMLLoader();
    		   loader3.setLocation( App.class.getResource("views/ArtistSoloDeployement.fxml"));
    		   loader3.setController(new ArtistSoloDeployementController(listArtists));
    		   Parent node3 = loader3.load();
    		   artistsTabAnchor.getChildren().add(node3);
    		   artistsTabAnchor.setTopAnchor(node3, 0d);
    		   artistsTabAnchor.setBottomAnchor(node3, 0d);
    		   artistsTabAnchor.setLeftAnchor(node3, 0d);
    		   artistsTabAnchor.setRightAnchor(node3, 0d);
    		   FXMLLoader loader2 = new FXMLLoader();
    		   loader2.setLocation( App.class.getResource("views/Player.fxml"));
    		   loader2.setController(new PlayerController(SongName));
    		   Parent node2 = loader2.load();
    		   borderPaneRoot.setBottom(node2);
    		   PlayList playList1 = new PlayList((long) 1, "PlayList1", null);
    		   PlayList playList2 = new PlayList((long) 1, "PlayList1", null);
    		   List<PlayList> playLists = new ArrayList<PlayList>();
    		   playLists.add(playList1);
    		   playLists.add(playList2);
    		   playLists.add(playList2);
    		   playLists.add(playList2);
    		   playLists.add(playList2);
    		   playLists.add(playList2);
    		   playLists.add(playList2);
    		   playLists.add(playList2);
    		   playLists.add(playList2);
    		   FXMLLoader loader4 = new FXMLLoader();
    		   loader4.setLocation(App.class.getResource("views/PlayLists.fxml"));
    		   loader4.setController(new PlayListsController(playLists));
    		   Parent node4 = loader4.load();
    		   playListTabAnchor.getChildren().add(node4);
    		   playListTabAnchor.setTopAnchor(node4, 0d);
    		   playListTabAnchor.setBottomAnchor(node4, 0d);
    		   playListTabAnchor.setLeftAnchor(node4, 0d);
    		   playListTabAnchor.setRightAnchor(node4, 0d);
    		   initAlbumList();
    		   
    		   
    		  
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
		
	}
    
    public void initAlbumList() {
       	try {
 		   FXMLLoader loader = new FXMLLoader();
 		   Artist artist1 = new Artist((long) 1, "arctic monkeys", null, null, null);
		   Artist artist2 = new Artist((long) 2, "arctic monkeys", null, null, null);
 		   Album album1 = new Album((long) 1, "album1", null, null, artist1);
 		   Album album2 = new Album((long) 2, "album2", null, null, artist2);
 		   Album album3 = new Album((long) 2, "album2", null, null, artist2);
 		   Album album4 = new Album((long) 2, "album2", null, null, artist2);
 		   Album album5 = new Album((long) 2, "album2", null, null, artist2);
 		   Album album6 = new Album((long) 2, "album2", null, null, artist2);
 		   Album album7 = new Album((long) 2, "album2", null, null, artist2);
 		   Album album8 = new Album((long) 2, "album2", null, null, artist2);
 		   List<Album> listOfAlbums = new ArrayList<Album>();
 		   listOfAlbums.add(album1);
 		   listOfAlbums.add(album2);
 		   listOfAlbums.add(album3);
 		   listOfAlbums.add(album4);
 		   listOfAlbums.add(album5);
 		   listOfAlbums.add(album6);
 		   listOfAlbums.add(album7);
 		   listOfAlbums.add(album8);
 		   listOfAlbums.add(album8);
 		   listOfAlbums.add(album8);
 		   listOfAlbums.add(album8);
 		   listOfAlbums.add(album8);
 		   listOfAlbums.add(album8);
 		   listOfAlbums.add(album8);
 		   listOfAlbums.add(album8);
 		   loader.setLocation( App.class.getResource("views/AlbumList.fxml"));
 		   loader.setController(new AlbumsListController(listOfAlbums));
 		   Parent node = loader.load();
 		   albumTabAnchor.getChildren().add(node);
 		   albumTabAnchor.setTopAnchor(node, 0d);
 		   albumTabAnchor.setBottomAnchor(node, 0d);
 		   albumTabAnchor.setRightAnchor(node, 0d);
 		   albumTabAnchor.setLeftAnchor(node, 0d);
 		
 		   
 		
 		   FXMLLoader loader2 = new FXMLLoader();
 		   loader2.setLocation( App.class.getResource("views/Player.fxml"));
 		   Parent node2 = loader2.load();
 		   
 		   borderPaneRoot.setBottom(node2);
 		   
 		  
 	} catch (IOException e) {
 		e.printStackTrace();
 	}
    }
    
    public void initSongList() {
       	try {
 		   FXMLLoader loader = new FXMLLoader();

 		   loader.setLocation( App.class.getResource("views/SongList.fxml"));
 		   loader.setController(new SongListController(listSongs));
 		  
 		   Parent node = loader.load();
 		  songTabAnchor.getChildren().add(node);
 		   songTabAnchor.setTopAnchor(node, 0d);
 		   songTabAnchor.setBottomAnchor(node, 0d);
 		   songTabAnchor.setRightAnchor(node, 0d);
 		   songTabAnchor.setLeftAnchor(node, 0d);
 		
 		   
 		
 		   FXMLLoader loader2 = new FXMLLoader();
 		   loader2.setLocation( App.class.getResource("views/Player.fxml"));
 		   Parent node2 = loader2.load();
 		   
 		   borderPaneRoot.setBottom(node2);
 		   
 		  
 	} catch (IOException e) {
 		e.printStackTrace();
 	}
    }

}

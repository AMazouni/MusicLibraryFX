package org.openjfx.MusicLibraryFX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openjfx.MusicLibraryFX.controllers.MainController;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
/*	static ToolBar toolbar = new ToolBar();
	static BorderPane layout = new BorderPane();
	static HBox h1 = new HBox();
	static HBox h2 = new HBox();
	static VBox v1 = new VBox();
	static Button songsButton = new Button("Songs");
	static Button playListButton = new Button("PlayList");
	static Button artistButton = new Button("Artist");
	static Button albumButton = new Button("Album");
	static ProgressBar progressBar = new ProgressBar(0);
	static Label l1 = new Label("00:00");
	static Label l2 = new Label("03:26");
	static Button play = new Button();
	static Button forward = new Button();
	static Button backward = new Button();*/
	
	@Override
	public void start(Stage stage) throws IOException {

	       /*Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("src/main/java/org/openjfx/MusicLibraryFX/views/Album.fxml"));*/
	      List<Song> listSongs = new ArrayList<Song>();
	      List<Album> listAlbum = new ArrayList<Album>();
	      List<PlayList> listPlaylist = new ArrayList<PlayList>();
	      List<Artist> listArtist = new ArrayList<Artist>();
	      long id = 2;
	      Artist artist1 = new Artist();
	      artist1.setId(id);
	      artist1.setName("Artist1");
	      Album album1= new Album(id,"Album",new Date(),listSongs,artist1);
	      Song song1 = new Song(id, "Song1", new Date(), album1, artist1, null, null);
	      Song song2 = new Song(id+2, "Song2", new Date(), album1, artist1, null, null);
	      Song song3 = new Song(id+2, "Song3", new Date(), album1, artist1, null, null);
	      Song song4 = new Song(id+2, "Song4", new Date(), album1, artist1, null, null);
	      Song song5 = new Song(id+2, "Song5", new Date(), album1, artist1, null, null);
	      Song song6 = new Song(id+2, "Song6", new Date(), album1, artist1, null, null);
	      listSongs.add(song1);
	      listSongs.add(song2);
	      listSongs.add(song3);
	      listSongs.add(song4);
	      listSongs.add(song5);
	      listSongs.add(song6);
	      listSongs.add(song6);
	      listSongs.add(song6); listSongs.add(song6);
	      listSongs.add(song6);
	      listAlbum.add(album1);
	      String SongName = "MP3Test";
		FXMLLoader loader = new FXMLLoader();

		   loader.setLocation( App.class.getResource("views/Main.fxml"));
		   loader.setController(new MainController(listSongs,listAlbum,listPlaylist,listArtist,SongName));
		  
		   Parent root = loader.load();
		
		
	/*	Parent root = FXMLLoader.load(getClass().getResource("views/Main.fxml")); */
	        Scene scene = new Scene(root);
	        scene.getStylesheets().setAll(App.class.getResource("views/stylesheet.css").toExternalForm());
	        
	        scene.setRoot(root);
	        stage.setResizable(false);
	        stage.setTitle("FXML Welcome");
	        stage.setScene(scene);
	        stage.show();}

		/*Init();
		stage.setTitle("test");
		Scene scene = new Scene(layout, 600, 300);
		stage.setScene(scene);
		stage.show();

		b.setOnAction(e -> {
			try {
			//	Call<List<Artist>> repos = service.artist();
				List<Artist> foundArtists = artistServiceImpl.findAll();
				for (Artist artiste : foundArtists) {

					artistVbox.getChildren().add(new Label(Long.toString(artiste.getId())));
					artistVbox.getChildren().add(new Label(artiste.getName()));
				}
				layout.setCenter(artistVbox);

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}); */
		

	

	public static void main(String[] args) {
		launch();
		

		
	}
	//To initialize the first static template that won't change , top and bottom .
/*	public void Init () {
		// Initialize the Top
		toolbar.getItems().addAll(songsButton, new Separator(), playListButton, new Separator(), artistButton, new Separator(), albumButton);
		layout.setTop(toolbar);
		// Initialize the Bottom
		Image playimage = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\play.png");
		Image forwardImage = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\fastforward.jpg");
		Image BackwardImage = new Image("file:\\" + System.getProperty("user.dir") + "\\UIImages\\backward.png");
		ImageView playview = new ImageView(playimage);
		playview.setOpacity(0.20);
		playview.setFitHeight(50);
		playview.setFitWidth(50);
		ImageView forwardview = new ImageView(forwardImage);
		forwardview.setOpacity(0.20);
		forwardview.setFitHeight(50);
		forwardview.setFitWidth(50);
		ImageView backwardview = new ImageView(BackwardImage);
		backwardview.setOpacity(0.20);
		backwardview.setFitHeight(50);
		backwardview.setFitWidth(50);
		play.setGraphic(playview);
		forward.setGraphic(forwardview);
		backward.setGraphic(backwardview);
		h2.setSpacing(200);
		h1.getChildren().add(backward);
		h1.getChildren().add(play);
		h1.getChildren().add(forward);
		h2.getChildren().add(l1);
		h2.getChildren().add(progressBar);
		h2.getChildren().add(l2);
		v1.getChildren().add(h2);
		v1.getChildren().add(h1);
		layout.setBottom(v1);
		
	}*/

}
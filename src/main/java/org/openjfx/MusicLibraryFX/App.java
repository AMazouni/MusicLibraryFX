package org.openjfx.MusicLibraryFX;

import java.io.IOException;

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
	       Parent root = FXMLLoader.load(getClass().getResource("views/test.fxml"));
	       
	        Scene scene = new Scene(root);
	        stage.setResizable(false);
	        stage.setTitle("FXML Welcome");
	        stage.setScene(scene);
	        stage.show();
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
		

	}

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
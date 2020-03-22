package org.openjfx.MusicLibraryFX;

import java.io.IOException;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.repositories.ArtistRepo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * JavaFX App
 */
public class App extends Application {
	static ToolBar toolbar = new ToolBar();
	static BorderPane layout = new BorderPane();

	@Override
	public void start(Stage stage) throws IOException {
		Retrofit retrofit = new Retrofit.Builder().addConverterFactory(JacksonConverterFactory.create())
				.baseUrl("http://localhost:8080").build();
		ArtistRepo service = retrofit.create(ArtistRepo.class);

		stage.setTitle("test");

		HBox h = new HBox();
		VBox v = new VBox();
		VBox artistVbox = new VBox();
		Button b = new Button("Songs");

		b.setOnAction(e -> {
			try {
				Call<List<Artist>> repos = service.artist();
				List<Artist> foundArtists = repos.execute().body();
				for (Artist artiste : foundArtists) {

					artistVbox.getChildren().add(new Label(Long.toString(artiste.getId())));
					artistVbox.getChildren().add(new Label(artiste.getName()));
				}
				layout.setCenter(artistVbox);

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		Button b1 = new Button("PlayList");
		Button b2 = new Button("Artist");
		Button b3 = new Button("Album");
		ProgressBar progressBar = new ProgressBar(0);
		progressBar.setMinWidth(550);
		Image image = new Image("file:\\C:\\Users\\Ultrapc\\Desktop\\wallpapers\\play.png");
		Image forwardImage = new Image("file:\\C:\\Users\\Ultrapc\\Desktop\\wallpapers\\fastforward.jpg");
		Image BackwardImage = new Image("file:\\C:\\Users\\Ultrapc\\Desktop\\wallpapers\\backward.png");
		Button play = new Button();
		Button forward = new Button();
		Button backward = new Button();
		ImageView imageview = new ImageView(image);
		imageview.setOpacity(0.20);
		ImageView forwardview = new ImageView(forwardImage);
		forwardview.setOpacity(0.20);
		ImageView backwardview = new ImageView(BackwardImage);
		backwardview.setOpacity(0.20);
		imageview.setFitHeight(50);
		imageview.setFitWidth(50);
		forwardview.setFitHeight(50);
		forwardview.setFitWidth(50);
		backwardview.setFitHeight(50);
		backwardview.setFitWidth(50);
		play.setGraphic(imageview);
		forward.setGraphic(forwardview);
		backward.setGraphic(backwardview);
		toolbar.getItems().addAll(b, new Separator(), b1, new Separator(), b2, new Separator(), b3);
		layout.setTop(toolbar);
		h.getChildren().add(backward);
		h.getChildren().add(play);
		h.getChildren().add(forward);
		v.getChildren().add(progressBar);
		h.setPadding(new Insets(0, 0, 0, 170));
		v.getChildren().add(h);
		layout.setBottom(v);
		Scene scene = new Scene(layout, 600, 300);
		stage.setScene(scene);
		layout.setCenter(new tes());
		stage.show();

	}

	public static void main(String[] args) {
		launch();

		System.out.println(layout.getScene());
	}

}
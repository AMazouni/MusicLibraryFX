package org.openjfx.MusicLibraryFX;

import java.io.IOException;
import java.util.List;

import org.openjfx.MusicLibraryFX.retroServices.Artiste;
import org.openjfx.MusicLibraryFX.retroServices.GitHubService;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
 /*       var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        Retrofit retrofit = new Retrofit.Builder()
        		.addConverterFactory(JacksonConverterFactory.create())
        	    .baseUrl("http://localhost:8080")
        	    .build();
  Scene scene = new Scene(new StackPane());
  GitHubService service = retrofit.create(GitHubService.class);
  try { Call<List<Artiste>> repos = service.artist();
	
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".Successfull ? ="+repos.execute().body().toString());
         scene = new Scene(new StackPane(label), 640, 480);}catch (Exception e){
        	System.out.println(e.getMessage());
        }

    	stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        launch();
    }

}
package org.openjfx.MusicLibraryFX;

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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import retrofit2.Retrofit;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        Retrofit retrofit;

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
        /* 
         * stage.setTitle("test");
        ToolBar toolbar = new ToolBar();
        HBox h = new HBox();
        VBox v = new VBox();
        Button b = new Button("Songs");
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
        toolbar.getItems().addAll(b,new Separator(),b1,new Separator(),b2,new Separator(),b3);
        BorderPane layout = new BorderPane();
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
        stage.show();
         */
    }

    public static void main(String[] args) {
        launch();
    }

}
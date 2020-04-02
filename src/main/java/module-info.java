module MusicLibraryFX {
	exports org.openjfx.MusicLibraryFX;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires retrofit2;
	requires retrofit2.converter.jackson;
	requires converter.gson;
	requires javafx.fxml;
	requires com.fasterxml.jackson.annotation;
	requires jdk.compiler;
	requires java.desktop;
	
	exports org.openjfx.MusicLibraryFX.retrofit.beans;
	exports org.openjfx.MusicLibraryFX.controllers;
    
	opens org.openjfx.MusicLibraryFX.controllers;
	opens org.openjfx.MusicLibraryFX.views;

}
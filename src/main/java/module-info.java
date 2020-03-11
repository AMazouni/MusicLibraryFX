module MusicLibraryFX {
	exports org.openjfx.MusicLibraryFX;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires retrofit2;
	requires retrofit2.converter.jackson;
	requires converter.gson;
	requires com.fasterxml.jackson.annotation;
	exports org.openjfx.MusicLibraryFX.retroServices;
}
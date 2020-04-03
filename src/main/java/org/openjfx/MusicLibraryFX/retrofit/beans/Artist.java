package org.openjfx.MusicLibraryFX.retrofit.beans;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {

	@JsonProperty("id")
	Long id;
	 @JsonProperty("name")
	String name;
	String portrait;
	
	List<Album> albums = new ArrayList<Album>();
	List<Song> songs = new ArrayList<Song>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	public List<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	public Artist(Long id, String name, String portrait, List<Album> albums, List<Song> songs) {
		super();
		this.id = id;
		this.name = name;
		this.portrait = portrait;
		this.albums = albums;
		this.songs = songs;
	}
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}


}

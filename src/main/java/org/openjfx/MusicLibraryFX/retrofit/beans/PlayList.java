package org.openjfx.MusicLibraryFX.retrofit.beans;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	Long id;
	String libelle;
	
    List<Song> songs = new ArrayList<Song>();
 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public PlayList(Long id, String libelle, List<Song> songs) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.songs = songs;

	}
	public PlayList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

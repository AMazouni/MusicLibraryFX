package org.openjfx.MusicLibraryFX.retrofit.beans;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	Long id;
	String libelle;
 
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
	
	
	public PlayList(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public PlayList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

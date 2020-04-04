package org.openjfx.MusicLibraryFX.retrofit.beans;

import java.util.ArrayList;
import java.util.List;

public class Genre {

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
	
	public Genre(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

}

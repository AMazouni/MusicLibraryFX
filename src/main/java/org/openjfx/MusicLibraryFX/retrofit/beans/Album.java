package org.openjfx.MusicLibraryFX.retrofit.beans;

import java.util.Date;

public class Album {

	Long id;
	String libelle;
	Date releaseDate;
	Artist artist;
	String picture;
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Album(Long id, String libelle, Date releaseDate, Artist artist, String picture) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.releaseDate = releaseDate;
		this.artist = artist;
		this.picture = picture;
	}

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

}

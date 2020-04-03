package org.openjfx.MusicLibraryFX.retrofit.beans;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Song {
	Long id;
	String libelle;
	Date releaseDate;
	Album album;
	Artist artist;
	
	Genre genre;
	String songPath;
    String[] lyrics;
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
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getSongPath() {
		return songPath;
	}
	public void setSongPath(String songPath) {
		this.songPath = songPath;
	}
	public String[] getLyrics() {
		return lyrics;
	}
	public void setLyrics(String[] lyrics) {
		this.lyrics = lyrics;
	}

	public Song(Long id, String libelle, Date releaseDate, Album album, Artist artist, Genre genre, String songPath,
			String[] lyrics) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.releaseDate = releaseDate;
		this.album = album;
		this.artist = artist;
		this.genre = genre;
		this.songPath = songPath;
		this.lyrics = lyrics;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

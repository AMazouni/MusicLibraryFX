package org.openjfx.MusicLibraryFX.retrofit.beans;

public class PlayListSong {
	Long id;
	Song song;
	PlayList playList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public PlayList getPlayList() {
		return playList;
	}
	public void setPlayList(PlayList playList) {
		this.playList = playList;
	}
	public PlayListSong(Long id, Song song, PlayList playList) {
		super();
		this.id = id;
		this.song = song;
		this.playList = playList;
	}
	public PlayListSong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

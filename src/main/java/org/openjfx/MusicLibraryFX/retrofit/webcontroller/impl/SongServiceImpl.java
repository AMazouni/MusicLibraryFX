package org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;
import org.openjfx.MusicLibraryFX.retrofit.repositories.ArtistRepo;
import org.openjfx.MusicLibraryFX.retrofit.repositories.SongRepo;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade.SongService;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class SongServiceImpl implements SongService {
	
	Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(JacksonConverterFactory.create())
			.baseUrl("http://localhost:8080/MusicLibrary-Api/Song/").build();
	SongRepo service = retrofit.create(SongRepo.class);
	
	@Override
	public List<Song> findAll() throws IOException {
		Call<List<Song>> repos = service.findAll();
		List<Song> foundArtists = repos.execute().body();
		return foundArtists;
	}

	@Override
	public Song findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Long id, Song song) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(Song song) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Song findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Song> findByReleaseDate(Date releaseDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Song> findByAlbumId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Song> findByArtistId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Song> findByPlayListSongsPlayListId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Song> findByGenreId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

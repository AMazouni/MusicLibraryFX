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
	public Song findById(Long id) throws IOException {
		Call<Song> repos = service.findById(id);
		Song foundArtist = repos.execute().body();
		return foundArtist;
	}

	@Override
	public int deleteAll() throws IOException {
		Call<Integer> repos = service.deleteAll();
		Integer success = repos.execute().body();
		return success;
	}

	@Override
	public int deleteById(Long id) throws IOException {
		Call<Integer> repos = service.deleteById(id);
		Integer success = repos.execute().body();
		return success;
	}

	@Override
	public int update(Long id, Song song) throws IOException {
		Call<Integer> repos = service.update(id, song);
		Integer success = repos.execute().body();
		return success;
	}

	@Override
	public int save(Song song) throws IOException {
		Call<Integer> repos = service.save(song);
		Integer success = repos.execute().body();
		return success;
	}

	@Override
	public List<Song> findByLibelle(String libelle) throws IOException {
		Call<List<Song>> repos = service.findByLibelle(libelle);
		List<Song> foundArtists = repos.execute().body();
		return foundArtists;
	}

	@Override
	public List<Song> findByReleaseDate(Date releaseDate) throws IOException {
		Call<List<Song>> repos = service.findByReleaseDate(releaseDate);
		List<Song> foundArtists = repos.execute().body();
		return foundArtists;
	}

	@Override
	public List<Song> findByAlbumId(Long id) throws IOException {
		Call<List<Song>> repos = service.findByAlbumId(id);
		List<Song> foundArtists = repos.execute().body();
		return foundArtists;
	}

	@Override
	public List<Song> findByArtistId(Long id) throws IOException {
		Call<List<Song>> repos = service.findByArtistId(id);
		List<Song> foundArtists = repos.execute().body();
		return foundArtists;
	}

	@Override
	public List<Song> findByPlayListSongsPlayListId(Long id) throws IOException {
		Call<List<Song>> repos = service.findByPlayListSongsPlayListId(id);
		List<Song> foundArtists = repos.execute().body();
		return foundArtists;
	}

	@Override
	public List<Song> findByGenreId(Long id) throws IOException {
		Call<List<Song>> repos = service.findByGenreId(id);
		List<Song> foundArtists = repos.execute().body();
		return foundArtists;
	}


}

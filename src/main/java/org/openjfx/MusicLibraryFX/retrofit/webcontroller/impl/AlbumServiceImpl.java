package org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.repositories.AlbumRepo;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade.AlbumService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class AlbumServiceImpl implements AlbumService {
	
	Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(JacksonConverterFactory.create())
			.baseUrl("http://localhost:8080").build();
	AlbumRepo service = retrofit.create(AlbumRepo.class);
	
	@Override
	public List<Album> findAll() throws IOException {
		Call<List<Album>> repos = service.findAll();
		List<Album> albums = repos.execute().body();
		return albums;
	}

	@Override
	public Album findById(Long id) throws IOException {
		Call<Album> repos = service.findById(id);
		Album album = repos.execute().body();
		return album;
	}

	@Override
	public int deleteAll() throws IOException {
		Call<Integer> repos = service.deleteAll();
		int result = repos.execute().body();
		return result;
	}

	@Override
	public int deleteById(Long id) throws IOException {
		Call<Integer> repos = service.deleteById(id);
		int result = repos.execute().body();
		return result;
	}

	@Override
	public int update(Long id, Album album) throws IOException {
		Call<Integer> repos = service.update(id, album);
		int result = repos.execute().body();
		return result;
	}

	@Override
	public int save(Album album) throws IOException {
		Call<Integer> repos = service.save(album);
		int result = repos.execute().body();
		return result;
	}

	@Override
	public Album findByLibelle(String libelle) {
		
		return null;
	}

	@Override
	public List<Album> findByReleaseDate(Date releaseDate) throws IOException {
		Call<List<Album>> repos = service.findByReleaseDate(releaseDate);
		List<Album> albums = repos.execute().body();
		return albums;
	}

	@Override
	public List<Album> findByArtistId(Long id) throws IOException {
		Call<List<Album>> repos = service.findByArtistId(id);
		List<Album> albums = repos.execute().body();
		return albums;
	}

}

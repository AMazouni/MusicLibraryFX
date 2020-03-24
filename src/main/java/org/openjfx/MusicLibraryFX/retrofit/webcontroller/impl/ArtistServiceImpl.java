package org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl;

import java.io.IOException;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.repositories.ArtistRepo;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade.ArtistService;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ArtistServiceImpl implements ArtistService {
	Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(JacksonConverterFactory.create())
			.baseUrl("http://localhost:8080/MusicLibrary-Api/Artist/").build();
	ArtistRepo service = retrofit.create(ArtistRepo.class);
	
	@Override
	public List<Artist> findAll() throws IOException {
		Call<List<Artist>> repos = service.findAll();
		List<Artist> artists = repos.execute().body();
		return artists;
	}

	@Override
	public Artist findById(Long id) throws IOException {
		Call<Artist> repos = service.findById(id);
		Artist artist = repos.execute().body();
		return artist;
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
	public int update(Long id, Artist artist) throws IOException {
		Call<Integer> repos = service.update(id, artist);
		int result = repos.execute().body();
		return result;
	}

	@Override
	public int save(Artist artist) throws IOException {
		Call<Integer> repos = service.save(artist);
		int result = repos.execute().body();
		return result;
	}

	@Override
	public Artist findbyName(String name) throws IOException {
		Call<Artist> repos = service.findbyName(name);
		Artist artist = repos.execute().body();
		return artist;
	}

}

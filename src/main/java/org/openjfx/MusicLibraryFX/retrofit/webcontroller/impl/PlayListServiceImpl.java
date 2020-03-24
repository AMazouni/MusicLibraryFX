package org.openjfx.MusicLibraryFX.retrofit.webcontroller.impl;

import java.io.IOException;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;
import org.openjfx.MusicLibraryFX.retrofit.repositories.PlayListRepo;
import org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade.PlayListService;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class PlayListServiceImpl implements PlayListService{
	Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(JacksonConverterFactory.create())
			.baseUrl("http://localhost:8080/MusicLibrary-Api/PlayList/").build();
	PlayListRepo service = retrofit.create(PlayListRepo.class);
	@Override
	public List<PlayList> findAll() throws IOException {
		Call<List<PlayList>> repos = service.findAll();
		List<PlayList> playLists = repos.execute().body();
		return playLists;
	}

	@Override
	public PlayList findById(Long id) throws IOException {
		Call<PlayList> repos = service.findById(id);
		PlayList playList = repos.execute().body();
		return playList;
	}

	@Override
	public int deleteAll() throws IOException {
		Call<Integer> repos = service.deleteAll();
		int response = repos.execute().body();
		return response;
	}

	@Override
	public int deleteById(Long id) throws IOException {
		Call<Integer> repos = service.deleteById(id);
		int response = repos.execute().body();
		return response;
	}

	@Override
	public int update(Long id, PlayList playList) throws IOException {
		Call<Integer> repos = service.update(id, playList);
		int response = repos.execute().body();
		return response;
	}

	@Override
	public int save(PlayList playList) throws IOException {
		Call<Integer> repos = service.save(playList);
		int response = repos.execute().body();
		return response;
	}

	@Override
	public PlayList findByLibelle(String libelle) throws IOException {
		Call<PlayList> repos = service.findByLibelle(libelle);
		PlayList playList = repos.execute().body();
		return playList;
	}

}

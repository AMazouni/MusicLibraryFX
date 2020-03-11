package org.openjfx.MusicLibraryFX.retroServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubService {
	  @GET("MusicLibrary-Api/Artist/findAll")
	  Call<List<Artiste>> artist();
	}
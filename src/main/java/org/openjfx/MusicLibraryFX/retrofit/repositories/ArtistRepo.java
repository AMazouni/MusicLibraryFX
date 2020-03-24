package org.openjfx.MusicLibraryFX.retrofit.repositories;

import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ArtistRepo {
	  @GET("findAll")
	  Call<List<Artist>> findAll();
	  @GET("findById/Id/{id}")
	  Call<Artist> findById(@Path("id") Long id);
	  @DELETE("deleteAll")
	  Call<Integer> deleteAll();
	  @DELETE("deleteById/Id/{id}")
	  Call<Integer> deleteById(@Path("id") Long id);
	  @PUT("update/Id/{id}")
	  Call<Integer> update(@Path("id") Long id,@Body Artist artist);
	  @GET("save")
	  Call<Integer> save(@Body Artist artist);
	  @GET("findByName/Name/{name}")
	  Call<Artist> findbyName(@Path("name") String name);
	}
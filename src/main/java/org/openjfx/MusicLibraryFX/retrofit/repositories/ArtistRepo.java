package org.openjfx.MusicLibraryFX.retrofit.repositories;

import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

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
	  @PUT("update/name/{name}")
	  Call<Integer> update(@Path("name") String name,@Body Artist artist);
	  @GET("save")
	  Call<Integer> save(@Body Artist artist);
	  @GET("findByName/Name/{name}")
	  Call<Artist> findbyName(@Path("name") String name);
	  @GET("/findByName/Name/{name}/ListSongs")
	  Call<List<Song>> ListSongsByName(@Path("name") String name);
	  @GET("/findByName/Id/{id}/ListSongs")
	  Call<List<Song>> ListSongsById(@Path("name") String name);
	  @GET("/findByName/Name/{name}/ListAlbums")
	  Call<List<Album>> ListAlbumsByName(@Path("name") String name);
	  @GET("/findByName/Id/{id}/ListAlbums")
	  Call<List<Album>> ListAlbumsById(@Path("name") String name);
	}
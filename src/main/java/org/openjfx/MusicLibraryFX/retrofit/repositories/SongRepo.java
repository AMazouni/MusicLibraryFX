package org.openjfx.MusicLibraryFX.retrofit.repositories;

import java.util.Date;
import java.util.List;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.POST;

public interface SongRepo {
	@GET("findAll")
	Call<List<Song>> findAll();
	@GET("findById/Id/{id}")
	Call<Song> findById(@Path("id") Long id);
	@DELETE("deleteAll")
	Call<Integer> deleteAll();
	@DELETE("deleteById/Id/{id}")
	Call<Integer> deleteById(@Path("id") Long id);
	@PUT("update/Id/{id}")
	Call<Integer> update(@Path("id") Long id,@Body Song song);
	@POST("save")
	Call<Integer> save(@Body Song song);
	@GET("findByLibelle/Libelle/{libelle}")
	Call<List<Song>> findByLibelle(@Path("libelle") String libelle);
	@GET("findByReleaseDate/ReleaseDate/{releaseDate}")
	Call<List<Song>> findByReleaseDate(@Path("releaseDate") Date releaseDate);
	@GET("findByAlbumId/AlbumId/{id}")
	Call<List<Song>> findByAlbumId(@Path("id") Long id);
	@GET("findByArtistId/Id/{id}")
	Call<List<Song>> findByArtistId(@Path("id") Long id);
	@GET("findByPlayListSongsPlayListId/Id/{id}")
	Call<List<Song>> findByPlayListSongsPlayListId(@Path("id") Long id);
	@GET("findByGenreId/Id/{id}")
	Call<List<Song>> findByGenreId(@Path("id") Long id);
} 

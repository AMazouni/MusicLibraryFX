package org.openjfx.MusicLibraryFX.retrofit.repositories;

import java.util.List;
import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PlayListRepo {
	@GET("findAll")
	Call<List<PlayList>> findAll();
	@GET("findById/Id/{id}")
	Call<PlayList> findById(@Path("id") Long id);
	@DELETE("deleteAll")
	Call<Integer> deleteAll();
	@DELETE("deleteById/Id/{id}")
	Call<Integer> deleteById(@Path("id") Long id);
	@PUT("update/Id/{id}")
	Call<Integer> update(@Path("id") Long id,@Body PlayList playList);
	@POST("save")
	Call<Integer> save(@Body PlayList playList);
	@GET("findByLibelle/Libelle/{libelle}")
	Call<PlayList> findByLibelle(@Path("libelle") String libelle);
	@GET("findByLibelle/Libelle/{libelle}/ListSongs")
	Call<List<Song>> ListSongsByLibelle(@Path("libelle") String libelle);
	@GET("findByLibelle/Id/{Id}/ListSongs")
	Call<List<Song>> ListSongsById(@Path("Id") Long  Id);
}

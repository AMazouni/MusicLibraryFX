package org.openjfx.MusicLibraryFX.retrofit.repositories;

import java.util.Date;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Album;
import org.openjfx.MusicLibraryFX.retrofit.beans.Genre;
import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AlbumRepo {
	@GET("findAll")
	Call<List<Album>> findAll();
	@GET("findById/Id/{id}")
	Call<Album> findById(@Path("id") Long id);
	@DELETE("deleteAll")
	Call<Integer> deleteAll();
	@DELETE("deleteById/Id/{id}")
	Call<Integer> deleteById(@Path("id") Long id);
	@PUT("update/Id/{id}")
	Call<Integer> update(@Path("id") Long id,@Body Album album);
	@GET("findByLibelle/Libelle/{libelle}")
	Call<Album> findByLibelle(@Path("libelle") String libelle);
	@GET("findByReleaseDate/ReleaseDate/{releaseDate}")
	Call<List<Album>> findByReleaseDate(@Path("releaseDate") Date releaseDate);
	@GET("findByArtistId/ArtistId/{id}")
	Call<List<Album>> findByArtistId(@Path("id") Long id);
	@GET("save")
	Call<Integer> save(@Body Album album);
	@GET("searchByLibelle/Libelle/{Libelle}")
	Call<List<Album>> searchByLibelle(@Path("Libelle")String Libelle);
	@GET("findByLibelle/Libelle/{libelle}/ListSongs")
	Call<List<Song>> ListSongsByLibelle(@Path("libelle") String libelle);
	@GET("findById/Id/{Id}/ListSongs")
	Call<List<Song>> ListSongsById(@Path("Id") Long id);
}

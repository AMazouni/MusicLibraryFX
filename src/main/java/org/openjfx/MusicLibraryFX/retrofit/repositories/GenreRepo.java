package org.openjfx.MusicLibraryFX.retrofit.repositories;

import java.util.List;
import org.openjfx.MusicLibraryFX.retrofit.beans.Genre;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface GenreRepo {
	@GET("findAll")
	Call<List<Genre>> findAll();
	@GET("findById/Id/{id}")
	Call<Genre> findById(@Path("id") Long id);
	@DELETE("deleteAll")
	Call<Integer> deleteAll();
	@DELETE("deleteById/Id/{id}")
	Call<Integer> deleteById(@Path("id") Long id);
	@PUT("update/Id/{id}")
	Call<Integer> update(@Path("id") Long id,@Body Genre genre);
	@POST("save")
	Call<Integer> save(@Body Genre genre);
}

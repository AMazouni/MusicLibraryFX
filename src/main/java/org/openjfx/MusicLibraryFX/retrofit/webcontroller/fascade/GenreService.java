package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Genre;

public interface GenreService {
	public List<Genre> findAll();

	public Genre findById(Long id);

	public int deleteAll();

	public int deleteById(Long id);

	public int update(Long id, Genre genre);

	public int save(Genre genre);
}

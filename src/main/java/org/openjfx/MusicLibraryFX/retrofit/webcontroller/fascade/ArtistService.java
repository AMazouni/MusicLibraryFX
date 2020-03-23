package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;

public interface ArtistService {
	public List<Artist> findAll();

	public Artist findById(Long id);

	public int deleteAll();

	public int deleteById(Long id);

	public int update(Long id, Artist artist);

	public int save(Artist artist);

	public Artist findbyName(String name);
}

package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.io.IOException;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Artist;

public interface ArtistService {
	public List<Artist> findAll() throws IOException;

	public Artist findById(Long id) throws IOException;

	public int deleteAll() throws IOException;

	public int deleteById(Long id) throws IOException;

	public int update(Long id, Artist artist) throws IOException;

	public int save(Artist artist) throws IOException;

	public Artist findbyName(String name) throws IOException;
}

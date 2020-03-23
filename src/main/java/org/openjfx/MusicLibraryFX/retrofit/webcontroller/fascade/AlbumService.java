package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Album;

public interface AlbumService {
	public List<Album> findAll() throws IOException;

	public Album findById(Long id) throws IOException;

	public int deleteAll() throws IOException;

	public int deleteById(Long id) throws IOException;

	public int update(Long id, Album album) throws IOException;

	public int save(Album album) throws IOException;

	public Album findByLibelle(String libelle);

	public List<Album> findByReleaseDate(Date releaseDate) throws IOException;

	public List<Album> findByArtistId(Long id) throws IOException;
}

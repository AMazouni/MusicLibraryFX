package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.util.Date;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Album;

public interface AlbumService {
	public List<Album> findAll();

	public Album findById(Long id);

	public int deleteAll();

	public int deleteById(Long id);

	public int update(Long id, Album album);

	public int save(Album album);

	public Album findByLibelle(String libelle);

	public List<Album> findByReleaseDate(Date releaseDate);

	public List<Album> findByArtistId(Long id);
}

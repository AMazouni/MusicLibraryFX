package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

public interface SongService {
	public List<Song> findAll() throws IOException;

	public Song findById(Long id) throws IOException;

	public int deleteAll() throws IOException;

	public int deleteById(Long id) throws IOException;

	public int update(Long id, Song song) throws IOException;

	public int save(Song song) throws IOException;

	public List<Song> findByLibelle(String libelle) throws IOException;

	public List<Song> findByReleaseDate(Date releaseDate) throws IOException;

	public List<Song> findByAlbumId(Long id) throws IOException;

	public List<Song> findByArtistId(Long id) throws IOException;

	public List<Song> findByPlayListSongsPlayListId(Long id) throws IOException;

	public List<Song> findByGenreId(Long id) throws IOException;
}

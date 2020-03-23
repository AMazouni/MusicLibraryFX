package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.Song;

public interface SongService {
	public List<Song> findAll() throws IOException;

	public Song findById(Long id);

	public int deleteAll();

	public int deleteById(Long id);

	public int update(Long id, Song song);

	public int save(Song song);

	public Song findByLibelle(String libelle);

	public List<Song> findByReleaseDate(Date releaseDate);

	public List<Song> findByAlbumId(Long id);

	public List<Song> findByArtistId(Long id);

	public List<Song> findByPlayListSongsPlayListId(Long id);

	public List<Song> findByGenreId(Long id);
}

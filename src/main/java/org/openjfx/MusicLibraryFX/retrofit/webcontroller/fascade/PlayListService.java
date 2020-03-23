package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.io.IOException;
import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;

public interface PlayListService {
	public List<PlayList> findAll() throws IOException;
	public PlayList findById(Long id) throws IOException;
	public int deleteAll() throws IOException;
	public int deleteById(Long id) throws IOException;
	public int update(Long id,PlayList playList) throws IOException;
	public int save(PlayList playList) throws IOException;
	public PlayList findByLibelle(String libelle) throws IOException;
}

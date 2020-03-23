package org.openjfx.MusicLibraryFX.retrofit.webcontroller.fascade;

import java.util.List;

import org.openjfx.MusicLibraryFX.retrofit.beans.PlayList;

public interface PlayListService {
	public List<PlayList> findAll();
	public PlayList findById(Long id);
	public int deleteAll();
	public int deleteById(Long id);
	public int update(Long id,PlayList playList);
	public int save(PlayList playList);
	public PlayList findByLibelle(String libelle);
}

package org.openjfx.MusicLibraryFX.retrofit.beans;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {

	@JsonProperty("id")
	Long id;
	 @JsonProperty("name")
	String name;
	String portrait;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	
	public Artist(Long id, String name, String portrait) {
		super();
		this.id = id;
		this.name = name;
		this.portrait = portrait;
	}
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}


}

package org.openjfx.MusicLibraryFX.retrofit.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {

	@JsonProperty("id")
	Long id;
	 @JsonProperty("name")
	String name;
	
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artist(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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

}

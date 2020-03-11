package org.openjfx.MusicLibraryFX.retroServices;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artiste {
	 @Override
	public String toString() {
		return "FUCKING ARTIST[id=" + id + ", name=" + name + "]";
	}
	@JsonProperty("id")
	Long id;
	 @JsonProperty("name")
	String name;
	
	public Artiste() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artiste(Long id, String name) {
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

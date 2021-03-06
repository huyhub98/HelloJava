package com.linkin.model;

public class GioiTinhDTO {

	private Long id;
	private String name;

	public GioiTinhDTO() {
		super();
	}

	public GioiTinhDTO(String name) {
		super();
		this.name = name;
	}

	public GioiTinhDTO(Long id, String name) {
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

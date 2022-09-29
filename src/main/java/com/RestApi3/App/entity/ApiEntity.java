package com.RestApi3.App.entity;


public class ApiEntity {

	
	private int id;
	private String name;
	private String about;
	
	
	
	public ApiEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAbout() {
		return about;
	}



	public void setAbout(String about) {
		this.about = about;
	}



	public ApiEntity(int id, String name, String about) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
	}



	@Override
	public String toString() {
		return "ApiEntity [id=" + id + ", name=" + name + ", about=" + about + "]";
	}
	
	
	
}

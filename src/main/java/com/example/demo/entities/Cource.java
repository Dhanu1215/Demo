package com.example.demo.entities;


public class Cource {

	private long id;
	private String tital;
	private String description;
	public Cource(long id, String tital, String description) {
		super();
		this.id = id;
		this.tital = tital;
		this.description = description;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTital() {
		return tital;
	}
	public void setTital(String tital) {
		this.tital = tital;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Cource [id=" + id + ", tital=" + tital + ", description=" + description + "]";
	}
	
	
}

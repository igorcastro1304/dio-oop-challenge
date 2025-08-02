package br.com.dio.challenge.domain;

public abstract class Info {
	protected static final double STANDARD_XP = 10d;
	
	private String name;
	private String description;
	
	public abstract double calculateXP();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}

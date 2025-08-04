package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
	private String name;
	private String description;
	private LocalDate startDate = LocalDate.now();
	private LocalDate endDate = startDate.plusDays(45);
	private Set<Content> contents = new LinkedHashSet<>();
	private Set<Dev> devs = new HashSet<>();
	
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void addContent(Content content) {
		this.contents.add(content);
	}
	
	public Set<Dev> getDevs() {
		return devs;
	}

	public void addDev(Dev dev) {
		this.devs.add(dev);
	}
	
	@Override
	public String toString() {
		return String.format("Bootcamp: {\n Nome: %s\n Descrição %s\n Data de Início: %s\n Data Final: %s\n Conteúdos: {\n %s \n}\n}\n", name, description,
				startDate, endDate, contents);
	}
}

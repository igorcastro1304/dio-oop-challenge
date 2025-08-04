package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Content> signedContents = new LinkedHashSet<>();
	private Set<Content> finishedContents = new LinkedHashSet<>();

	public void assignToBootcamp(Bootcamp bootcamp) {
		this.signedContents.addAll(bootcamp.getContents());

		bootcamp.addDev(this);
	}

	public void finishContent() {
		Optional<Content> content = this.signedContents.stream().findFirst();
		if (content.isPresent()) {
			this.finishedContents.add(content.get());
			this.signedContents.remove(content.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo.");
		}
	}

	public double calculateTotalXP() {
		return this.finishedContents.stream().mapToDouble(Content::calculateXP).sum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSignedContents() {
		return signedContents;
	}

	public void setSignedContents(Set<Content> signedContents) {
		this.signedContents = signedContents;
	}

	public Set<Content> getFinishedContents() {
		return finishedContents;
	}

	public void setFinishedContents(Set<Content> finishedContents) {
		this.finishedContents = finishedContents;
	}

	@Override
	public String toString() {
		return String.format("Dev: {\n Nome: %s\n Conteúdos inscritos: {\n %s \n}\n Conteúdos finalizados: {\n %s \n}\n XP Total: %.2f\n}\n", name, signedContents, finishedContents, calculateTotalXP());
	}
}

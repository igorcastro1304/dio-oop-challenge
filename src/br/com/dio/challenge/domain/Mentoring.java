package br.com.dio.challenge.domain;

import java.time.LocalDateTime;

public class Mentoring extends Info {
	private LocalDateTime date;

	@Override
	public double calculateXP() {
		return STANDARD_XP + 20d;
	}
	
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return String.format("Mentoria: {\n Nome: %s\n Descrição: %s\n Data: %s\n}\n", getName(), getDescription(), date);
	}
}

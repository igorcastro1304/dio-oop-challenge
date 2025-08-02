package br.com.dio.challenge.domain;

public class Course extends Content {
	private int workload;

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public double calculateXP() {
		return STANDARD_XP * workload;
	}

	@Override
	public String toString() {
		return String.format("Curso: {\n Nome: %s\n Descrição %s\n Carga horária: %d\n}\n", getName(), getDescription(),
				workload);
	}
}

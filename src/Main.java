import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
import br.com.dio.challenge.domain.Mentoring;

public class Main {
	public static void main(String[] args) {
		Mentoring mentoring01 = new Mentoring();
		mentoring01.setName("Como conseguir sua vaga na GFT?");
		mentoring01.setDescription("Mentoria focada em desenvolver o aluno para a vaga de estágio da DIO.");
		mentoring01.setDate(LocalDateTime.of(2025, 4, 13, 15, 30));
		
		Course course01 = new Course();
		course01.setName("Curso Java");
		course01.setDescription("Curso focado em desenvolvimento Java.");
		course01.setWorkload(80);
		
		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setName("Bootcamp Java");
		bootcampJava.setDescription("Bootcamp voltado para o ensino da linguagem Java");
		bootcampJava.addContent(course01);
		bootcampJava.addContent(mentoring01);
		
		Dev devIgor = new Dev();
		devIgor.setName("Igor Castro");
		devIgor.assignToBootcamp(bootcampJava);
		devIgor.finishContent();
		
		System.out.println(mentoring01);
		System.out.println(course01);
		System.out.println(bootcampJava);
		System.out.println(devIgor);
	}
}

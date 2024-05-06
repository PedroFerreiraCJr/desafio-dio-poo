package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descri��o curso JavaScript");
		curso2.setCargaHoraria(4);

		System.out.println(curso1);
		System.out.println(curso2);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descri��o Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conteudos inscritos de camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos conclu�dos de camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("----------------------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Jo�o");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de Jo�o: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteudos inscritos de Jo�o: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos conclu�dos de Jo�o: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}
}

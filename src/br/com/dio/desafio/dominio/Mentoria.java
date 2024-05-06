package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;

	public Mentoria() {
		super();
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mentoria [data=").append(data).append(", getTitulo()=").append(getTitulo())
				.append(", getDescricao()=").append(getDescricao()).append("]");
		return builder.toString();
	}
}

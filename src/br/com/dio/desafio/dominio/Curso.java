package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;

	public Curso() {
		super();
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * this.cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [cargaHoraria=").append(cargaHoraria).append(", getTitulo()=").append(getTitulo())
				.append(", getDescricao()=").append(getDescricao()).append("]");
		return builder.toString();
	}
}

package atividade_5_2;

public class Curso {
	private int id;
	private String nome;
	private String semestre;
	private int duracao;
	
	public Curso(int id, String nome, String semestre, int duracao) {
		this.id = id;
		this.nome = nome;
		this.semestre = semestre;
		this.duracao = duracao;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public int getDuracao() {
		return duracao;
	}
}

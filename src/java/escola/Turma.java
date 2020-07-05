package escola;

import java.util.ArrayList;

public class Turma {
	/** Atributos */
	private String sigla;
	private int ano;
	
	/**Importa lista de Alunos para a variavel alunos  */
	private ArrayList<Aluno> alunos;
	
	/**Importa lista de Professores para a variavel professores  */
	private ArrayList<Professor> professores;
	
	/**Importa lista de Professores para a variavel professores  */
	private ArrayList<Disciplina> disciplinas;
	
	/** Metodo */
	void adicionarAluno() {
		
	}

	
	
	
	/** Metodos Getters e Setters*/
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}

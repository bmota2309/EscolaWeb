package escola;

import java.util.Date;

/** Classe Aluno herda de Pessoa*/
public class Aluno extends Pessoa {
	/** Atributo */
	private Date dataNascimento;
	
	/** Importa apenas 1 Turma para classe Aluno */
	private Turma turma;
	
	
	/** Metodo */
	void realizarAvaliacao() {
		
	}


	
	/** Metodos Getters e Setters */
	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Turma getTurma() {
		return turma;
	}


	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
}
